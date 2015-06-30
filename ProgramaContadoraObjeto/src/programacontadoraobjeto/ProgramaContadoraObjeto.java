package programacontadoraobjeto;

import java.util.Scanner;

public class ProgramaContadoraObjeto {

    public static void main(String[] args) {

        Contadora conta = new Contadora(0);

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");

        conta.setValor(input.nextInt());
        conta.ContarAte();
    }
}
