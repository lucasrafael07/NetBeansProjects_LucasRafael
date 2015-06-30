package programasegundosemhoras;
import java.util.Scanner;

public class ProgramaSegundosEmHoras {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double horas,segundos;
    
    System.out.println("QUANTOS SEGUNDOS? ");
    segundos = input.nextDouble();
    horas = (segundos/3600);
    
    System.out.println(horas+" HORAS");
    }  
}
