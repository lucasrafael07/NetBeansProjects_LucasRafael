package programatempoexperiencia;

import java.util.Scanner;

public class ProgramaTempoExperiencia {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.println("QUAL O TEMPO DE EXPERIENCIA? ");
    double tempoexp = input.nextDouble();
    
    
if(tempoexp<5.1){
    System.out.println("JUNIOR");
}else if((tempoexp>=5.1) && (tempoexp<10.9)){
        System.out.println("PLENO");
}else if(tempoexp>10.1) {
            System.out.println("SENIOR");
}
    }
        }