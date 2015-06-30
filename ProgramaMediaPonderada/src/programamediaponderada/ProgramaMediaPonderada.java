package programamediaponderada;
import java.util.Scanner;

public class ProgramaMediaPonderada {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c,p1,p2,p3,mediaPonderada;
    
    System.out.println("INFORME O VALOR DE A: ");
    a = input.nextInt();
    
    System.out.println("INFORME O VALOR DE B: ");
    b = input.nextInt();
    
    System.out.println("INFORME O VALOR DE C: ");
    c = input.nextInt();
    
    System.out.println("INFORME O VALOR DE P1: ");
    p1 = input.nextInt();
    
    System.out.println("INFORME O VALOR DE P2: ");
    p2 = input.nextInt();
    
    System.out.println("INFORME O VALOR DE P3: ");
    p3 = input.nextInt();
    
    mediaPonderada = ((a*p1+b*p2+c*p3)/(p1+p2+p3));
    
    System.out.println("A MÉDIA PONDERADA É: " + mediaPonderada);
}
    }
