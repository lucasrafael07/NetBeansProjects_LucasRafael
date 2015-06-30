package programaleiavalorecontedezeroateovalorswitch;

import java.util.Scanner;

public class ProgramaLeiaValorEConteDeZeroAteOValorSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR: ");
        int valor = input.nextInt();

        for (int contador = 0; contador <= valor; contador++) {
            System.out.println(contador);

        }

    }
}
