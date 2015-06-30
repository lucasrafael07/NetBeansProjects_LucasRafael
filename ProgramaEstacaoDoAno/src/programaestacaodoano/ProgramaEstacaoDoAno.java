package programaestacaodoano;

import java.util.Scanner;

public class ProgramaEstacaoDoAno {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mes, dia;

        System.out.println("Informe o dia: ");
        dia = input.nextInt();

        System.out.println("Informe o mês: ");
        mes = input.nextInt();
        
        
        if (((mes==9)&&((dia>=23)&&(dia<=21))) ||
        ((mes==12)&&((dia>=21)&&(dia<=31))))
        System.out.println("OUTONO");
        
        
  

        }
    }
