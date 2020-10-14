/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.de.dados;

/**
 *
 * @author cristilane
 */
import java.util.Arrays;
import java.util.Random;

public class MetodoSelecao {

    public static void main(String[] args) {
        int[] v = gerarVetor(10);
        selectionSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void selectionSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
                int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) 
                    menor = j;  
            } 
            trocar(v, i, menor);
        }
    }

    private static void trocar(int[]v, int i, int menor) {
        int aux = v[i];
        v[i] = v[menor];
        v[menor] = aux;
    }

    private static int[] gerarVetor (int n) {
        int[] v = new int[n];
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v[i] = gerador.nextInt(100);
        }
        return v;
    }

}



