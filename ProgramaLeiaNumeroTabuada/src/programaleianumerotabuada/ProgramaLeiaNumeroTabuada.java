package programaleianumerotabuada;

import java.util.Scanner;

public class ProgramaLeiaNumeroTabuada {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("DIGITE UM VALOR: ");
int valor = input.nextInt();

int cont = 1;

while (cont<=10){
    int resposta = valor*cont;
        System.out.println(cont+"X"+valor+"="+resposta);
            cont++;}
}
    }
