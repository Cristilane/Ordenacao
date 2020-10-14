/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.de.dados;

import java.util.Arrays;

/**
 *
 * @author cristilane
 */
public class MetodoIntercalacao {
    public static void main(String[] args) {
        int []v={4,6,7,3,5,1,2,8};
        int [] w= new int[v.length];
        mergerSort(v,w,0,v.length-1);
        
        System.out.println(Arrays.toString(v));
    }

    private static void mergerSort(int[] v, int[] w, int ini, int fim) {
           if(ini<fim){
               int meio= (ini+fim)/2;
               mergerSort(v, w,ini, meio);
               mergerSort(v, w, meio+1, fim);
               intercalar(v, w, ini, meio, fim);
           }
    }

    private static void intercalar(int[] v, int[] w, int ini, int meio, int fim) {
        for (int k = ini; k <= fim; k++) 
            w[k]=v[k];
            
        int i= ini; //primeira metado do vetor
        int j= meio+1;// meio até o fim do vetor
        
            for (int k = ini; k<= fim; k++) {
                if(i>meio) v[k]= w[j++];
                else if (j>fim) v[k]=w[i++];
                else if (w[i]<w[j]) v[k]= w[i++];
                else v[k]= w[j++];
            }
        
  
    }
}

