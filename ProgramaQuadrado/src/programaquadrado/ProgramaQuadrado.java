package programaquadrado;

import java.util.Scanner;

public class ProgramaQuadrado {

    public static void main(String[] args) {

        Quadrado quad = new Quadrado(0, 0, 0);

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o lado: ");
        quad.setLado(input.nextInt());

        quad.calcularArea();
        quad.calcularPerim();

        System.out.println("Area= " + quad.getArea() + "\n" + "Perimetro= " + quad.getPerim());
    }
}
