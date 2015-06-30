package programabaskhara;

import java.util.Scanner;

public class ProgramaBaskhara {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor de A: ");
    double a = input.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = input.nextDouble();
            System.out.println("Digite o valor de C: ");
               double c = input.nextDouble();
    double delta = ((b*b)-4*(a*c));
        double x1;
            double x2;
    
if (delta > 0){
    x1 = (-b + Math.sqrt (delta)) / (2*a);
        x2 = (-b - Math.sqrt (delta)) / (2*a);
    System.out.println("X1 é: "+x1);
    System.out.println("X2 é: "+x2);}
    
    else if (delta == 0){
    x1 = (-b + 0) / 2*a;
        x2 = (-b - Math.sqrt (delta)) / (2*a);
    System.out.println("X1 é: "+x1);
    System.out.println("X2 é: "+x2);}

    
    else if (delta == 0){
    x1 = (-b + 0) / 2*a;
        x2 = (0-b + 0)/ 2*a;
    System.out.println("X1 é: "+x1);
    System.out.println("X2 é: "+x2);}

    else 
        System.out.println("NÃO EXISTE");
}
  }