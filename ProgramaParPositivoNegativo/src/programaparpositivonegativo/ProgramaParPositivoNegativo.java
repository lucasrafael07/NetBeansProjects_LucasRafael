package programaparpositivonegativo;

import java.util.Scanner;

public class ProgramaParPositivoNegativo {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("DIGITE UM NUMERO INTEIRO");
    int valor = input.nextInt();
    
if((valor>0) && (valor % 2 ==0)){
    System.out.println("PAR POSITIVO");
}else if((valor<0) && (valor % 2 ==0)){
    System.out.println("PAR NEGATIVO");
}else if((valor>0) && (valor % 2 == 1)){
    System.out.println("IMPAR POSITIVO");
}else if((valor<0) && (valor % 2 ==1)){
    System.out.println("IMPAR NEGATIVO");
}
    }
        }