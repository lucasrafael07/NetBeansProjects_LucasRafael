package programacalculadoraoo;

import java.util.Scanner;

public class Leitura {

    Scanner inputDouble = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    public void exibirDouble(Object mensagem) {
        System.out.println(mensagem);
    }

    public double lerDouble(String mensagem) {
        this.exibirDouble(mensagem);
        return inputDouble.nextDouble();
    }

    public void exibirInt(Object mensagem) {
        System.out.println(mensagem);
    }

    public double lerInt(String mensagem) {
        this.exibirInt(mensagem);
        return inputInt.nextInt();
    }
}
