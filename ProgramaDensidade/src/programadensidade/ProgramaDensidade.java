/*
2 - Faça um programa que receba a area total de uma cidade e o numero total de 
habitantes. O programa deve mostrar a densidade de habitantes e se é populosa,
sabendo-se que densidade maior que 5 a cidade é considerada populosa.
 */
package programadensidade;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ProgramaDensidade {


public static void main(String[] args) {
    

Scanner input = new Scanner(System.in);

System.out.println("DIGA O TOTAL DE HABITANTES: ");
double hab = input.nextDouble();

System.out.println("DIGA A AREA TOTAL: ");
double area = input.nextDouble();

double densidade = hab/area;

if (densidade >5){
System.out.println("CIDADE POPULOSA");
}else{
System.out.println("CIDADE NÃO É POPULOSA");
}
    }
        }