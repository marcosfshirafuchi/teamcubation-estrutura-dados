package EstruturaDeDados.Array;

import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 1. Crie uma aplicação que calcule a média de 10 números inteiros e printe o resultado no console.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[10];
        double media =0;
        double soma =0;
        for (int i=0; i<numeros.length;i++){
            System.out.printf("Digite o %dº numero: ", i+1);
            numeros[i] = scanner.nextInt();
        }
        for (int i=0; i<numeros.length;i++) {
            soma +=numeros[i];
        }
        media = soma /10;
        System.out.printf("A média de %f / 10 = %f\n",soma, media);
        scanner.close();
    }
}
