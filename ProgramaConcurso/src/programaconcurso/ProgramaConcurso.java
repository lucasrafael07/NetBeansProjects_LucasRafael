package programaconcurso;

import java.util.Scanner;

public class ProgramaConcurso {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("QUAL SUA IDADE? ");
    int idade = input.nextInt();
    
if((idade>=18) && (idade<=60)){
    System.out.println("PARTICIPA DO CONCURSO.");
}else{
    System.out.println("NÃO PARTICIPA DO CONCURSO.");
}
    }
        }
