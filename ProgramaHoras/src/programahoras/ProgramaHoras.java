package programahoras;
import java.util.Scanner;

public class ProgramaHoras {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int horas,segundos;
    
    System.out.println("QUANTOS SEGUNDOS VOCÊ QUER CONVERTER? ");
    segundos = input.nextInt();
    
    horas = (segundos/3600);
    
    System.out.println(horas + " HORAS");
    }
}
