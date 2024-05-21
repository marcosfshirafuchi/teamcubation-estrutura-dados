package EstruturaDeDados.Array;

import java.util.Scanner;

public class Exercicio02 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 2. Crie uma aplicação que receba a altura (em float) de 5 pessoas e determine qual a maior pessoa e qual a menor pessoa.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float[] alturas = new Float[5];

        for (int i=0;i <alturas.length;i++){
            System.out.printf("Digite a %dª altura: ",i+1);
            alturas[i] = scanner.nextFloat();
        }
        float menorAltura = alturas[4];
        float maiorAltura = alturas[0];
        System.out.println("Impressão das alturas: ");
        for (float altura : alturas){
            if (altura< menorAltura){
                menorAltura = altura;
            }
            if (altura > maiorAltura){
                maiorAltura = altura;
            }
            System.out.println(altura);
        }
        System.out.println("Menor altura: " +menorAltura);
        System.out.println("Maior altura: " +maiorAltura);
        scanner.close();
    }
}
