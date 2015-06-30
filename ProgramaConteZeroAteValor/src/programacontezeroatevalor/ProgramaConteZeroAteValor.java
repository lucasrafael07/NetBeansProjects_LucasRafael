package programacontezeroatevalor;

import java.util.Scanner;

public class ProgramaConteZeroAteValor {

public static void main(String[] args) {

Scanner input =  new Scanner(System.in);


System.out.println("DIGITE UM VALOR: ");
int valor = input.nextInt();

int contador = 0;

while(contador <= valor){
    System.out.println(contador);
    contador++;
}   
    }
        }