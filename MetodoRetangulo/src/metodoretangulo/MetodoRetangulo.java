package metodoretangulo;

import java.util.Scanner;

public class MetodoRetangulo {

    public static void main(String[] args) {

        double areaRetangulo = retangulo();
        System.out.println("A area do retangulo é: " + areaRetangulo);

    }

    public static double retangulo() {

        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;

        System.out.println("Informe a base do retangulo: ");
        base = input.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        altura = input.nextDouble();
        areaRetangulo = base * altura;

        return areaRetangulo;

    }

}
