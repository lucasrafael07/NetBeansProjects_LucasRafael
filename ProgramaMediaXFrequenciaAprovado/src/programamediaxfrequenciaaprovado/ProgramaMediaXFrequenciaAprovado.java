package programamediaxfrequenciaaprovado;

import java.util.Scanner;

public class ProgramaMediaXFrequenciaAprovado {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("DIGITE A MEDIA FINAL DO ALUNO: ");
    int media = input.nextInt();
    
    System.out.println("QUAL A % DE FRENQUÊNCIA DO ALUNO: ");
    int frequencia = input.nextInt();
    
if((media >= 60) && (frequencia >= 75)){
    System.out.println("ALUNO APROVADO");
}else{
    System.out.println("ALUNO REPROVADO");
}
    }
        }