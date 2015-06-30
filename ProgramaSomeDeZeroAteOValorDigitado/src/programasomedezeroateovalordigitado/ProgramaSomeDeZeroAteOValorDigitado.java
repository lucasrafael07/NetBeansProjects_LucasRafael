package programasomedezeroateovalordigitado;

import java.util.Scanner;

public class ProgramaSomeDeZeroAteOValorDigitado {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("DIGITE UM VALOR");
int valorDigitado = input.nextInt();

int valorInicial = 0;

int soma = 0;

int i;

    for (i = valorInicial;i <= valorDigitado;){
        soma = soma+i;
        i++;
    }
    System.out.println(soma);
}
    }
