package programafolhadepagamentooo;

import java.util.Scanner;

public class Leitura {

    Scanner inputInt = new Scanner(System.in);
    Scanner inputDouble = new Scanner(System.in);

    public void exibirInt(Object mensagem1) {
        System.out.println(mensagem1);
    }

    public void exibirDouble(Object mensagem2) {
        System.out.println(mensagem2);
    }

    public int lerInteiro(String mensagem1) {
        this.exibirInt(mensagem1);
        return inputInt.nextInt();
    }

    public double lerDouble(String mensagem2) {
        this.exibirDouble(mensagem2);
        return inputDouble.nextDouble();
    }

}
