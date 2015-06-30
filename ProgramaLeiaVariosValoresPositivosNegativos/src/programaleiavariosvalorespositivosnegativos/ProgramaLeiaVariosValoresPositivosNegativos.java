package programaleiavariosvalorespositivosnegativos;
import java.util.Scanner;

public class ProgramaLeiaVariosValoresPositivosNegativos {
    

public static void main(String[] args) {
int valor = -1;
int positivo = 0;
int negativo = 0;

Scanner input = new Scanner(System.in);

while(valor !=0){
System.out.println("DIGITE UM VALOR, PARA TERMINAR DIGITE O NUMERO '0': ");
valor = input.nextInt();
    if (valor>0){
    positivo++;}
    if (valor<0){
    ++negativo;}
    }
System.out.println("FORAM DIGITADOS "+positivo+" POSITIVOS,E "+negativo+" NEGATIVOS.");
}
    }