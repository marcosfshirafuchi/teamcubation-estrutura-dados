package EstruturaDeDados.Array;

import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 3. Crie uma aplicação que ordene 5 nomes de pessoas de forma crescente, sem utilizar os métodos "sort" do Java.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pessoas = new String[5];
        for (int i=0; i<pessoas.length;i++){
            System.out.printf("Digite o nome da %dª pessoa: ",i+1);
            pessoas[i] = scanner.nextLine();
        }
        System.out.println("Impressão das pessoas digitadas: ");
        System.out.println();
        for (String pessoasDigitadas : pessoas){
            System.out.println(pessoasDigitadas);
        }

        System.out.println("Impressão das pessoas digitadas em Ordem Crescente: ");
        System.out.println();
        String[] pessoasOrdenadasDeOrdemCrescente = ordernacaoDePessoas(pessoas);
        for (String pessoasEmOrdemCrescente : pessoasOrdenadasDeOrdemCrescente)
        {
            System.out.println(pessoasEmOrdemCrescente);
        }
        System.out.println();
       scanner.close();
    }

    public static String[] ordernacaoDePessoas(String[] pessoas) {
        for (int i = 0; i < pessoas.length - 1; i++) {
            for (int j = i + 1; j < pessoas.length; j++) {
                if (comparacaoEntrePessoas(pessoas[i], pessoas[j]) > 0) // words[i] is greater than words[j]
                {
                    String temp = pessoas[i];
                    pessoas[i] = pessoas[j];
                    pessoas[j] = temp;
                }
            }
        }
        return pessoas;
    }

    public static int comparacaoEntrePessoas(String pessoas1, String pessoas2) {
        for (int i = 0; i < Math.min(pessoas1.length(), pessoas2.length()); i++) {
            // comparando valores unicodes
            if ((int) pessoas1.charAt(i) != (int) pessoas2.charAt(i))
                return (int) pessoas1.charAt(i) - (int) pessoas2.charAt(i);
        }
        //Palavra menor ocorre no início da palavra maior
        if (pessoas1.length() != pessoas2.length())
            return pessoas1.length() - pessoas2.length();
        else
            return 0;
    }
}
