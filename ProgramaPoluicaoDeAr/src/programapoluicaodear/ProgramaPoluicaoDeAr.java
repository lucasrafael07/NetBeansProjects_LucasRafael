package programapoluicaodear;

import java.util.Scanner;

public class ProgramaPoluicaoDeAr {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("QUAL A TAXA DE POLUIÇÃO? ");
    double taxaPoluicao = input.nextDouble();

if ((taxaPoluicao>0) && (taxaPoluicao<=0.5)){
    System.out.println("TAXA ADMISSIVEL");
}else if((taxaPoluicao>0.5) && (taxaPoluicao<1.1)){
    System.out.println("PERIGO");
}else if((taxaPoluicao==0) || (taxaPoluicao>1)){
    System.out.println("MEDICAO INCORRETA");
}
    }
        }