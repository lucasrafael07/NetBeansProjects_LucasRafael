package programakilosemgramas;
import java.util.Scanner;

public class ProgramaKilosEmGramas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gramas, kilos;
        
        System.out.println("Diga o valor em gramas? ");
        gramas =  input.nextInt();
        
        kilos = gramas / 1000;
        gramas = gramas % 1000;
        
        System.out.println("O total de Kilos é: "+ kilos);
        System.out.println ("O total de gramas é: "+ gramas);
}    
    }
