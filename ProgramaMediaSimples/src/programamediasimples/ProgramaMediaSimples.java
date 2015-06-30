package programamediasimples;
import java.util.Scanner;

public class ProgramaMediaSimples {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a,b,c, mediaSimples;
    
    System.out.println("INFORME O VALOR DE A: ");
    a = input.nextDouble();
    
    System.out.println("INFORME O VALOR DE B: ");
    b = input.nextDouble();
    
    System.out.println("INFORME O VALOR DE C: ");
    c = input.nextDouble();
    
    mediaSimples = (a+b+c)/3;
    
    System.out.println("A MEDIA SIMPLES DOS TRES VALORES É: " + mediaSimples);
}    
    }
