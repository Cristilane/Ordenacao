/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.de.dados;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author cristilane
 */
public class MetodoInsecao {
    public static void main(String[] args) {
        int []v= gerarVetor(40);
        insertionSort(v);
        System.out.println(Arrays.toString(v));
    }
public static int[] gerarVetor(int n){
    int []v= new int[n];
    Random gerador = new Random();
    for (int i = 0; i < n; i++) {
        v[i]=gerador.nextInt(100);
    }return v;
}
    private static void insertionSort(int[] v) {
        int  x,j;
        for (int i = 1; i < v.length; i++) {
            x=v[i];//2
            j=i-1;
            while((j>=0)&&(v[j]>x)){
                v[j+1]=v[j];
                j--;
            }
            v[j+1]=x;
        }   
    }
}
