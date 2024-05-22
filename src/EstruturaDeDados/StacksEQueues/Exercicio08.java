package EstruturaDeDados.StacksEQueues;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio08 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 8. Crie uma aplicação que armazene comandos do usuário em um bloco de texto, por exemplo: "digitar A", "digitar X", "cortar", "colar", etc. Caso a entrada seja a expressão "CTRL + Z", você deve remover da lista e printar na tela o último comando executado.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String path = "C:/Users/famil/Documents/Teamcubation/comandosDigitados.txt";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String comandos = "";
        boolean execucao = true;
        boolean verificacao = true;
        while( execucao){
            System.out.print("Escreva comandos: ");
            comandos = scanner.nextLine().toUpperCase();

            if (comandos.contains("CTRL + Z")){
                execucao = false;
                buffWrite.append(comandos + "\n");
            }else{
                buffWrite.append(comandos + "\n");
            }
        }
        buffWrite.close();
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        System.out.println();
        System.out.println("Impressão dos arquivos de entrada gravados no arquivo txt: ");
        while (verificacao) {
            if (linha != null) {
                System.out.println(linha);
                stack.push(linha);

            } else{
                verificacao = false;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Impressão de saída do arquivo: ");
        System.out.println();
        while(!stack.isEmpty()){
            if (stack.contains("CTRL + Z")){
                stack.pop();
            }
            else{
                System.out.println(stack.pop());
                break;
            }
        }
        scanner.close();
    }

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

}
