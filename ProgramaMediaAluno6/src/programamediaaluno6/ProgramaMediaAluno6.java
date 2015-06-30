package programamediaaluno6;

import java.util.Scanner;

public class ProgramaMediaAluno6 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("DIGITE SUA PRIMEIRA NOTA: ");
    int primeiraNota = input.nextInt();
    
    System.out.println("DIGITE SUA SEGUNDA NOTA: ");
    int segundaNota = input.nextInt();

    int media  = ((primeiraNota+segundaNota)/2);
    
if(media >= 60){
    System.out.println("ALUNO APROVADO");
}else{
    System.out.println("ALUNO REPROVADO");
}   
    }
        }
