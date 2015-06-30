package programahipotenusa;

import java.util.Scanner;

public class ProgramaHipotenusa {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Digite o primeiro Cateto: ");
double cateto1 = input.nextDouble();

System.out.println("Digite o segundo Cateto: ");
double cateto2 = input.nextDouble();

double hipotenusa = Math.sqrt ((cateto1*cateto1)+(cateto2*cateto2));

System.out.println("A Hipotenusa é :" +hipotenusa);
    }    
}