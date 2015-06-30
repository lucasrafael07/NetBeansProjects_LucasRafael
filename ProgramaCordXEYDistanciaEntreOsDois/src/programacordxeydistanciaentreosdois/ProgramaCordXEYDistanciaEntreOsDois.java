package programacordxeydistanciaentreosdois;

import java.util.Scanner;

public class ProgramaCordXEYDistanciaEntreOsDois {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("DIGITE O X1: ");
    double x1 = input.nextInt();

    System.out.println("DIGITE O X2: ");
    double x2 = input.nextInt();

    System.out.println("DIGITE O Y1: ");
    double y1 = input.nextInt();

    System.out.println("DIGITE O Y2: ");
    double y2 = input.nextInt();
    
    double contax = ((x1-x2)*(x1-x2));
    
    double contay = ((y1-y2)*(y1-y2));
    
    double resultado = Math.sqrt (contax+contay);
    
    System.out.println(resultado);
}
    }