package programacalculoperimetro;
import java.util.Scanner;

public class ProgramaCalculoPerimetro {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double perimetro,area,lado,x,y;
    
    System.out.println("DIGA O VALOR DO LADO: ");
    lado = input.nextDouble();
    
    perimetro = (lado+lado+lado);
    area = (lado+lado+lado+lado);
    
    System.out.println("O VALOR DO PERIMETRO É: " + perimetro + " E O VALOR DA AREA É: " + area);
}    
    }
