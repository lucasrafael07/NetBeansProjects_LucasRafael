package programaleianumerotabuadaswitch;

import java.util.Scanner;

public class ProgramaLeiaNumeroTabuadaSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR: ");
        int valor = input.nextInt();

        for (int cont = 1; cont <= 10; cont++) {
            int resposta = valor * cont;
            System.out.println(cont + "X" + valor + "=" + resposta);

        }
    }
}
