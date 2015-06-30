package programacalculos;
import java.util.Scanner;

public class ProgramaCalculos {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c,d,e,f;
    
    System.out.println("DIGA O VALOR DE A: ");
    a = input.nextInt();
    b = a/2;
    c = b*b*b;
    d = c*2;
    e = d/3;
    f = e*e;
    
    System.out.println("O VALOR DE A É: " + a);
    System.out.println("O VALOR DE B É: " + b);
    System.out.println("O VALOR DE C É: " + c);
    System.out.println("O VALOR DE D É: " + d);
    System.out.println("O VALOR DE E É: " + e);
    System.out.println("O VALOR DE F É: " + f);
}
    }
