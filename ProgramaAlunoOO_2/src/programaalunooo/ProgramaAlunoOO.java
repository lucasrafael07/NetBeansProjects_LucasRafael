package programaalunooo;

import java.util.Scanner;

public class ProgramaAlunoOO {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Aluno alu = new Aluno("Sem nome", "Sem nome", 0, 0, 0, 0);

        System.out.println("Digite o NOME e as duas NOTAS do 1ºAluno: ");
        alu.setNome1(input1.nextLine());
        alu.setNota1(input2.nextInt());
        alu.setNota2(input2.nextInt());

        System.out.println("Digite o NOME e as duas NOTAS do 2ºAluno: ");
        alu.setNome2(input1.nextLine());
        alu.setNota3(input2.nextInt());
        alu.setNota4(input2.nextInt());

        System.out.println(alu.maior());
        System.out.println(alu.toString());

    }

}
