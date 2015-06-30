package programasomevaloresatedigitarzero;

import java.util.Scanner;

public class ProgramaSomeValoresAteDigitarZero {

    public static void main(String[] args) {

        Soma soma = new Soma(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor, para somar todos os valores digitados" + "\n"
                + "digite 0.");
        soma.setvalorInicial(input.nextInt());
        soma.somaNumeros();
    }

}
