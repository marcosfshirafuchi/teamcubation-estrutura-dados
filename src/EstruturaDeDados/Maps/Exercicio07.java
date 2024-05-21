package EstruturaDeDados.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio07 {
    /**
     * <h1> Teamcubation - Estrutura de Dados</h1>
     * Exercício: 7. Crie uma aplicação que armazene as notas de um aluno em determinadas matérias. A aplicação irá sempre FAZER A MÉDIA, caso o usuário digite novamente uma matéria já existente.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   19/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        Map<String, Double> materias = new HashMap<>();
        String disciplina;
        Double nota=0.0;
        Double notasSofar = 0.0;
        System.out.println("Digite a quantidade de materias e notas para cadastrar: ");
        int alunos = scanner.nextInt();
        for (int i =0; i < alunos ; i++ ){
            scanner.nextLine();
            System.out.println("Digite a matéria do Aluno: ");
            disciplina = scanner.nextLine();
            System.out.println("Digite a nota do Aluno: ");
            nota = scanner.nextDouble();
            //Entra no if quando a matéria ja está cadastrada no map.
            if(materias.containsKey(disciplina)){
                notasSofar = materias.get(disciplina);
                cont++;
                materias.put(disciplina,(nota + notasSofar)/ cont);
            }else{
                //Entra no else quando a matéria não está cadastrada no map.
                materias.put(disciplina, nota);
            }
        }
        System.out.println(materias);
        scanner.close();
    }

}
