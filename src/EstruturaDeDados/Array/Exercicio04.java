package EstruturaDeDados.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 4. Crie uma aplicação que conte quantos valores repetidos tem dentro de um array de 10 números inteiros. Lembrando que os números não necessariamente precisam ser sequenciados.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean found;
        for (int i = 0; i<numeros.length;i++){
            System.out.printf("Digite o %dº numero: ",i+1);
            numeros[i] = scanner.nextInt();
        }
        List<Number> lista = new ArrayList<Number>();
        // percorre o array de entrada
        for(int i=0; i<numeros.length; i++){
            // seta como não encontrado
            found = false;

            // procura na lista de números o elemento "i" do array de entrada
            for(int j=0; j<lista.size(); j++){
                // encontrou, incrementa e sai fora
                if (numeros[i] == lista.get(j).value){
                    lista.get(j).count++;
                    found = true;
                    break;
                }
            }

            // não encontrou o número, armazena
            if (!found)
                lista.add(new Number(numeros[i], 1));
        }
        System.out.println();
        System.out.println("Impressão dos números entrada: ");
        for (Number n:lista) {
            System.out.print( n.value + " ");
        }
        System.out.println();
        System.out.println();
        //Impressão dos numeros repetidos
        System.out.println("Impressão dos números repetidos: ");
        for (Number n:lista) {
            if (n.count > 1) {
                System.out.println("Número " + n.value + " aparece " + n.count + " vezes");
            }
        }
        scanner.close();
    }
    static class Number {
        int value;
        int count;

        public  Number(int x, int y){
            value = x;
            count = y;
        }
    }
}
