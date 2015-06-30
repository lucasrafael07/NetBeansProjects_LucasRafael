package programavalidacaodiames;

import java.util.Scanner;

public class ProgramaValidacaoDiaMes {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("DIGA O DIA: ");
    int dia = input.nextInt();
    
    System.out.println("DIGA O MÊS: ");
    int mes = input.nextInt();

if((dia>0) && (dia<32) && (mes>0) && (mes<13)){
    System.out.println("DATA VÁLIDA");
}else{
    System.out.println("DATA INVÁLIDA");
}   
    }
        }