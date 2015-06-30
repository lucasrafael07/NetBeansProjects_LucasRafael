package programaaluno;

import java.util.Scanner;

public class ProgramaAluno {

    public static void main(String[] args) {

        Scanner sca1 = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);
        Aluno al = new Aluno("Sem nome", "Sem nome", 0, 0);

        System.out.println("Digite nome e nota de um aluno");
        al.setNome1(sca1.nextLine());
        al.setNota1(sca2.nextDouble());

        System.out.println("Digite nome e nota de outro aluno");
        al.setNome2(sca1.nextLine());
        al.setNota2(sca2.nextDouble());

        System.out.println("Média=" + al.media());
        System.out.println("Maior nota=" + al.Maior());
        System.out.println(al.toString());

    }

}
