package EstruturaDeDados.ListsESets;

import java.util.*;

public class Exercicio06 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 6. Crie uma aplicação que receba qualquer quantidade de nomes e ao final imprima os nomes não duplicados, e a quantidade de vezes que o usuário digitou um nome duplicado.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();
        String nomePessoas;
        System.out.print("Digite a quantidade de pessoas para cadastrar: ");
        int quantidadeDePessoas = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= quantidadeDePessoas; i++) {

            System.out.printf("Digite o nome da %dª pessoa: ", i);
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
        System.out.println("Pessoas digitadas na lista: " + pessoas);
        int count = 0;
        int j=1;
        System.out.println();
        System.out.println("Impressão dos nomes repetidos e as suas quantidades:");
        Collections.sort(pessoas);
        for (int i = 0; i < pessoas.size(); i++) {
            count = Collections.frequency(pessoas, pessoas.get(i));

                if (repetidas.contains(pessoas.get(i))&&j ==count) {
                    System.out.println("O usuário digitou o nome " + pessoas.get(i) + ", " + count + " vezes.");
                    j=0;
                }else{
                    System.out.println("Não tem nomes repetidos!");
                }
                j++;
        }

        System.out.println();
        System.out.println("Lista só com palavras que não se repetem: " + soSemRepeteco);
        System.out.println();
        scanner.close();
    }
}
