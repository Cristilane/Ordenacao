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
public class MetodoBolha {
    public static void main(String[] args) {
        
        int []v = {9,8,4,6,3};
        bolha(v);
        System.out.println(Arrays.toString(v));
    }

    private static void bolha(int[] v) {
        for (int ultimo= v.length-1;ultimo>0;ultimo--) { // O(n*(n-1))= O(n^2)
    // percorre N elementos do vetor, ultimo- penultumo
            for(int i=0;i<ultimo;i++){ 
                if(v[i]>v[i+1]){
                    troca(v,i,i+1);
                    
                }
            }
            
        }
    }

    private static void troca(int[] v, int i, int j) {
        int aux=v[i];
        v[i]=v[j];
        v[j]=aux;
    }
}
