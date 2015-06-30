package programaperimetro;
import java.util.Scanner;

public class ProgramaPerimetro {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int base,altura,area,perimetro;
    
        System.out.println("QUAL A BASE? ");
        base = input.nextInt();
        
        System.out.println("QUAL A ALTURA? ");
        altura = input.nextInt();
        
        area = (base*altura);
        perimetro = (2*base+2*altura);
        
    System.out.println("A AREA É: "+area+", O PERIMETRO É: "+perimetro);
}
    }
