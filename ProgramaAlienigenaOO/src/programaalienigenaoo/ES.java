/**
 * Objeto que recebe e exibe os dados que o usuário digitar.
 */
package programaalienigenaoo;

import java.util.Scanner;

public class ES {

    Scanner inputDouble = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void exibirDouble(Object mensagem) {
        System.out.println(mensagem);
    }

    public double lerDouble(String mensagem) {
        this.exibirDouble(mensagem);
        return inputDouble.nextDouble();
    }

    public void exibirString(Object mensagem2) {
        System.out.println(mensagem2);
    }

    public String lerString(String mensagem2) {
        this.exibirString(mensagem2);
        return inputString.nextLine();
    }

}
