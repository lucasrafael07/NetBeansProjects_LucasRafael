package programanotasalunosaulacomplementar;

import java.util.Scanner;

public class ProgramaNotasAlunosAulaComplementar {

    public static void main(String[] args) {

        final int TOTAL_ALUNOS = 4; /* variavel sera fixa nao podendo ser alterada,repre-
         senta a quantidade de alunos da sala de aula*/

        final int TOTAL_BIMESTRES = 4; /* mostra a quantidade total de bimestres que o
         aluno vai percorrer*/

        final double NOTA_MINIMA = 70.0; /*Qualquer aluno que tive a nota abaixo deste
         valor esta reprovado*/

        Scanner input = new Scanner(System.in);

        String[] nomeAlunos = new String[TOTAL_ALUNOS];/*Tamanho do vetor vai ser basea
         do pelo quantidade de alunos definida na variavel TOTAL_ALUNOS*/

        double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];/* este vetor 
         sera baseado na quantidade de alunos e na quantidade de bimestres*/

        double[] mediaAlunos = new double[TOTAL_ALUNOS];

//Obter o nome dos alunos
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            System.out.println("Informe o nome do " + (i + 1) + " º aluno");/*acrescentado o valor 
             1 a variavel i para nao aparecer 0º aluno*/

            nomeAlunos[i] = input.nextLine();
        }
        System.out.println();
//obter notas dos alunos todos os bimestres
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            for (int j = 0; j < TOTAL_BIMESTRES; j++) {
                System.out.println("Informe a nota do aluno " + nomeAlunos[i] + " para o " + (j + 1) + "º bimestre");
                notaAlunos[i][j] = input.nextDouble();
            }
        }
        //calcular media alunos
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            for (int j = 0; j < TOTAL_BIMESTRES; j++) {
                mediaAlunos[i] += notaAlunos[i][j];//informamos que o valor dela sera 0 + notaAlunos
            }
            mediaAlunos[i] /= TOTAL_BIMESTRES;
        }
        //mostrar situação de cada aluno
        System.out.println("========= RESULTADO FINAL =========");

        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            if (mediaAlunos[i] >= NOTA_MINIMA) {
                System.out.println("Nome: " + nomeAlunos[i] + "   Média: " + mediaAlunos[i] + " Situação: APROVADO");
                continue;
            }
            System.out.println("Nome: " + nomeAlunos[i] + "   Média: " + mediaAlunos[i] + " Situação: REPROVADO");

        }

    }
}
