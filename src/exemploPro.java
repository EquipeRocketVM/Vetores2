
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
public class exemploPro {

    /* quantas vezes um determinado numero aparece dentro do vetor */
    static Scanner sc = new Scanner(System.in);

    static int[] numeroSorteados() {
        int[] numeros = {2, 4, 7, 10, 2, 3, 9, 2, 1, 10};
        return numeros;

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
