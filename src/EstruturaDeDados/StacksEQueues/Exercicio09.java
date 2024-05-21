package EstruturaDeDados.StacksEQueues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio09 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 9. Crie uma aplicação que armazene emails que foram enviados quando o usuário estava offline. Caso a entrada for "online", os emails devem ser enviados na ordem em que foram armazenados na sua lista, e removidos da lista.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String conexão = "offline";
        String tituloDoEmail = null;
        Queue<String> email = new ArrayDeque<>();
        while(conexão =="offline"){
            System.out.println("Digite o título do e-mail: ");
            tituloDoEmail = scanner.nextLine();
            email.add(tituloDoEmail);
            System.out.println("Deseja enviar mais algum e-mail: S - Sim ou N - Não");
            char opcao = scanner.next().toUpperCase().charAt(0);
            if (opcao == 'S'){
                conexão = "offline";
            }
            else{
                conexão = "online";
            }
            scanner.nextLine();
        }
        System.out.println("Email recebidos:");
        while (!email.isEmpty()) {
            System.out.println(email.poll());
        }

        scanner.close();
    }
}
