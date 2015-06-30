package programabrinquedo;

import java.util.Scanner;

public class ProgramaBrinquedo {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("QUAL SUA IDADE? ");
    int idade = input.nextInt();
    
    System.out.println("QUAL SUA ALTURA? ");
    double altura = input.nextDouble();
 
if((idade>=14) || (altura>=1)){
    System.out.println("PERMITIDO ANDAR NO BRINQUEDO");
}else{
    System.out.println("NÃO PERMITIDO ANDAR NO BRINQUEDO");
}   
    }
        }
