/* Faça um programa que leia o nome e a nota de dois alunos e retorne a 
 * média entre a nota dos alunos e nome do aluno de maior nota.*/
package programamediaalunogettersetter;

import java.util.Scanner;

public class ProgramaMediaAlunoGetterSetter {

    public static void main(String[] args) {

        CalculosMedia media = new CalculosMedia(null, null, 0, 0, 0, 0, 0, 0);

        Scanner input = new Scanner(System.in);

        System.out.println("QUAL O NOME DO PRIMEIRO ALUNO: ");
        media.setNome1(input.next());

        System.out.println("DIGITE A PRIMEIRA NOTA: ");
        media.setValor1(input.nextInt());

        System.out.println("DIGITE A SEGUNDA NOTA: ");
        media.setValor2(input.nextInt());

        System.out.println("QUAL O NOME DO SEGUNDO ALUNO: ");
        media.setNome2(input.next());

        System.out.println("DIGITE A PRIMEIRA NOTA: ");
        media.setValor3(input.nextInt());

        System.out.println("DIGITE A SEGUNDA NOTA: ");
        media.setValor4(input.nextInt());

        media.calcularMedia1();
        media.calcularMedia2();
        media.calcularMaior();
    }
}
