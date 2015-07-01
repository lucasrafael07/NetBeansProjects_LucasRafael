package programacalculadora;

import java.util.Scanner;

public class ProgramaCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora;

        calculadora = new Calculadora();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a Operação que você quer fazer: " + "\n"
                + "Somar Codigo = 1" + "\n"
                + "Subtrair Codigo = 2" + "\n"
                + "Dividir Codigo = 3" + "\n"
                + "Multiplicar Codigo = 4" + "\n"
                + "Porcentagem Codigo = 5" + "\n"
                + "Expoente Codigo = 6" + "\n"
                + "Expoente 2 Codigo = 7" + "\n"
                + "Sair = 8"
        );
        int operacao = input.nextInt();

        switch (operacao) {
            case 1:

                System.out.println("Digite o Primeiro Numero: ");
                double numero1 = input.nextDouble();

                System.out.println("Digite o Segundo Numero: ");
                double numero2 = input.nextDouble();

                calculadora.somar(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);
                break;

            case 2:

                System.out.println("Digite o Primeiro Numero: ");
                numero1 = input.nextDouble();

                System.out.println("Digite o Segundo Numero: ");
                numero2 = input.nextDouble();

                calculadora.subtrair(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);
                break;
            case 3:

                System.out.println("Digite o Primeiro Numero: ");
                numero1 = input.nextDouble();

                System.out.println("Digite o Segundo Numero: ");
                numero2 = input.nextDouble();

                calculadora.dividir(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);
                break;
            case 4:

                System.out.println("Digite o Primeiro Numero: ");
                numero1 = input.nextDouble();

                System.out.println("Digite o Segundo Numero: ");
                numero2 = input.nextDouble();

                calculadora.multiplicar(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);
                break;
            case 5:

                System.out.println("Digite o Primeiro Numero: ");
                numero1 = input.nextDouble();

                System.out.println("Digite quantos porcento do valor voce quer: ");
                numero2 = input.nextDouble();

                calculadora.porcentagem(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);
                break;
            case 6:

                System.out.println("Digite o Primeiro Numero: ");
                numero1 = input.nextDouble();

                System.out.println("Digite o expoente: ");
                numero2 = input.nextDouble();

                calculadora.expoente(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);
                break;
            case 7:
                System.out.println("Digite a Base: ");
                numero1 = input.nextDouble();

                System.out.println("Digite a potência: ");
                numero2 = input.nextDouble();

                calculadora.expoente2(numero1, numero2);//colocar a operação desejada
                System.out.println("O resultado é: " + calculadora.resultado);

            default:
                System.out.println("Obrigado volte Sempre");
                break;
        }
    }
}
