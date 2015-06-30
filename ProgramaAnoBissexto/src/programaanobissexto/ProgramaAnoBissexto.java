package programaanobissexto;

import java.util.Scanner;

public class ProgramaAnoBissexto {

public static void main(String[] args) {

Scanner input =  new Scanner(System.in);

    System.out.println("INSIRA UM ANO: ");
    int ano = input.nextInt();
    
if((ano % 400 == 0) || (ano % 4 ==0 && ano % 100 != 0)){
    System.out.println("ANO BISSEXTO");
}else{
    System.out.println("NÃO É UM ANO BISSEXTO");
}    
    }   
        }
