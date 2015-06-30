package programadoisvaloresmaiormenorigual;

import java.util.Scanner;

public class ProgramaDoisValoresMaiorMenorIgual {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("DIGITE O PRIMEIRO VALOR: ");
    int valor1 = input.nextInt();
    
    System.out.println("DIGITE O SEGUNDO VALOR: ");
    int valor2 = input.nextInt();

if (valor1==valor2){
    System.out.println("OS NUMERO SAO IGUAIS");
}else if(valor1>valor2){
    System.out.println("O MAIOR VALOR É: "+valor1);
}else{
    System.out.println("O MAIOR VALOR É: "+valor2);
}
    }
        }