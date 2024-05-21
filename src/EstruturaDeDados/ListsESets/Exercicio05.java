package EstruturaDeDados.ListsESets;

import java.util.*;

public class Exercicio05 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 5. Crie uma aplicação que receba qualquer quantidade de nomes e ao final imprima apenas os nomes que apareceram mais de uma vez.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();
        String nomePessoas;
        System.out.print("Digite a quantidade de pessoas para cadastrar: ");
        int quantidadeDePessoas = scanner.nextInt();

        scanner.nextLine();
        for (int i =1; i<=quantidadeDePessoas; i++){

            System.out.printf("Digite o nome da %dª pessoa: ",i);
            nomePessoas = scanner.nextLine();
            pessoas.add(nomePessoas);

        }
        Set<String> semRepeteco = new TreeSet<String>();
        Set<String> repetidas = new TreeSet<String>();
        Set<String> soSemRepeteco = new TreeSet<String>();
        for (String str : pessoas) {
            soSemRepeteco.add(str);
            if (!semRepeteco.add(str)) {
                repetidas.add(str);
                soSemRepeteco.remove(str);
            }
        }

        System.out.println();
        System.out.println("Lista só com palavras que se repetem: " + repetidas);
        scanner.close();
    }

}
