package programacalculofolhapagamento;

import java.util.Scanner;

public class ProgramaCalculoFolhaPagamento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salariobruto, valetransporte, inss, salarioliquido, valorhora;
        int produtohorastrabalhadas;

        System.out.println("QUANTAS HORAS FORAM TRABALHADAS? ");
        produtohorastrabalhadas = input.nextInt();

        System.out.println("QUAL O VALOR DA HORA TRABALHADA? ");
        valorhora = input.nextDouble();

        salariobruto = (produtohorastrabalhadas * valorhora);
        valetransporte = (salariobruto * 6 / 100);
        inss = (salariobruto * 11 / 100);
        salarioliquido = (salariobruto - valetransporte - inss);

        System.out.println("O SALARIO BRUTO É:R$ " + salariobruto);
        System.out.println("O VALOR DESCONTADO DO VALE TRANSPORTE É:R$ " + valetransporte);
        System.out.println("O VALOR DESCONTADO DO INSS É:R$ " + inss);
        System.out.println("O SALARIO LIQUIDO É:R$ " + salarioliquido);
    }
}
