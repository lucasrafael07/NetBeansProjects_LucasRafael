package programaaluno00_1;

import java.util.Scanner;

public class ProgramaAluno00_1 {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Alunos a1 = new Alunos("Sem nome", 0);
        Alunos a2 = new Alunos("Sem nome", 0);
        Calculos calc = new Calculos();

        System.out.println("Digite nome e nota de um aluno");
        a1.setNome(input1.nextLine());
        a1.setNota(input2.nextInt());

        System.out.println("Digite nome e nota de outro aluno");
        a2.setNome(input1.nextLine());
        a2.setNota(input2.nextInt());

        System.out.println("Média=" + calc.media1(a1.getNota(), a2.getNota()));
        System.out.println("Maior nota = " + calc.maior(a1.getNota(), a2.getNota(), a1.getNome(), a2.getNome()));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }

}
