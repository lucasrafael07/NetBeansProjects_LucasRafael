package programacalculadoraoo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramaCalculadoraOO {

    public static void main(String[] args) {

        Valores val = new Valores(0, 0);
        Leitura lei = new Leitura();
        Operacoes ope = new Operacoes();

        Scanner input = new Scanner(System.in);

        /*System.out.println("Digite a Operação que você quer fazer: " + "\n"
         + "Somar Codigo = 1" + "\n"
         + "Subtrair Codigo = 2" + "\n"
         + "Dividir Codigo = 3" + "\n"
         + "Multiplicar Codigo = 4" + "\n"
         + "Porcentagem Codigo = 5" + "\n"
         + "Expoente Codigo = 6" + "\n"
         + "Expoente 2 Codigo = 7" + "\n"
         + "Sair = 8"
         );*/
        int operacao;
        String aux = JOptionPane.showInputDialog("Digite a Operação que você quer fazer: " + "\n"
                + "Somar Codigo = 1" + "\n"
                + "Subtrair Codigo = 2" + "\n"
                + "Dividir Codigo = 3" + "\n"
                + "Multiplicar Codigo = 4" + "\n"
                + "Porcentagem Codigo = 5" + "\n"
                + "Expoente Codigo = 6" + "\n"
                + "Expoente 2 Codigo = 7" + "\n"
                + "Sair = 8");
        operacao = Integer.parseInt(aux);

        // int operacao = input.nextInt();
        switch (operacao) {
            case 1:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.somar(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;
            case 2:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.subtrair(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;
            case 3:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.dividir(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;
            case 4:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.multiplicar(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;
            case 5:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.porcentagem(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;
            case 6:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.expoente(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;
            case 7:

                val.setValor1(lei.lerDouble("DIGITE O 1º VALOR:"));
                val.setValor2(lei.lerDouble("DIGITE O 2º VALOR:"));

                ope.expoente2(val.getValor1(), val.getValor2());
                System.out.println("O resultado é: " + ope.resultado);
                break;

            default:
                System.out.println("CÓDIGO INVALIDO");
        }

    }
}
