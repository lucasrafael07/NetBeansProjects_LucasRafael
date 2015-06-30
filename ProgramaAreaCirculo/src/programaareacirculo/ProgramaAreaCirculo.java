package programaareacirculo;
import java.util.Scanner;

public class ProgramaAreaCirculo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio,area;
        
        final double PI = 3.14159265359;
    
    System.out.println("Informe o valor do Raio: ");
    raio = input.nextDouble();
    
    area = raio*raio*PI;
    
    System.out.println("O valor da area é: " + area);
}    
    }