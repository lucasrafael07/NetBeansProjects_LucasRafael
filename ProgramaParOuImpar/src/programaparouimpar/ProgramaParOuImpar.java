package programaparouimpar;

import java.util.Scanner;

public class ProgramaParOuImpar {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("DIGITE UM NUMERO INTEIRO: ");
    int numero =  input.nextInt();
    
    if(numero % 2 == 0){
        System.out.println("ESTE NUMERO É PAR");
}else{
        System.out.println("ESTE NUMERO É IMPAR");
}
    }
        }
