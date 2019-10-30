
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*1 - scanner global*/
/**
 *
 * @author vitoria.csilva15
 */
public class exemplo2Pro {

    /* quantas vezes um determinado numero aparece dentro do vetor mas de forma dianmica, usuario digita */
    static Scanner sc = new Scanner(System.in);

    static int[] numeroSorteados() {
        //  int[] numeros = {2, 4, 7, 10, 2, 3, 9, 2, 1, 10};

        System.out.println("Tamanho: ");
        int t = sc.nextInt();
        int[] vetor = new int [t];
        for (int i = 0; i <vetor.length; i++){
            System.out.printf("Vetor [%d]:  \n", i);
            vetor [i] = sc.nextInt();
        }
        
        
        return vetor;

    }

    static int obterNumero() {
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        return n;

    }

    static int ocorrencias(int[] v, int n) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        int[] vetor = numeroSorteados();
        int num = obterNumero();
        int cont = ocorrencias(vetor, num);
        System.out.printf("O número %d apareceu %d vezes \n", num, cont);
    }
}
