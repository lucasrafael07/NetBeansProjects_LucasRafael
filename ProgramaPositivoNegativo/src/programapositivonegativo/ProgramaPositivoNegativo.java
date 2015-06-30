package programapositivonegativo;

import java.util.Scanner;

public class ProgramaPositivoNegativo {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("DIGITE UM VALOR INTEIRO: ");
    int valor = input.nextInt();
    
if(valor < 0){
    System.out.println("VALOR NEGATIVO");
}else{
    System.out.println("VALOR POSITIVO");
}
    }
        }