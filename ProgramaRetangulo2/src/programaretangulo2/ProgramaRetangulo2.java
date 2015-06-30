package programaretangulo2;

import java.util.Scanner;

public class ProgramaRetangulo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Retangulo ret = new Retangulo(0, 0, 0, 0);

        System.out.println("Digite a Base: ");
        ret.setBase(input.nextInt());
        System.out.println("Digite a altura: ");
        ret.setAltura(input.nextInt());

        ret.calcularArea();
        ret.calcularPerim();

        System.out.println("Àrea = " + ret.getArea() + " Perimetro = " + ret.getPerim());

    }

}
