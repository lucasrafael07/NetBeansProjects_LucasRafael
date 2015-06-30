package programalancheriagettersetter;

import java.util.Scanner;

public class ProgramaLancheriaGetterSetter {

    public static void main(String[] args) {

        Lancheria lanche = new Lancheria(0);
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo a lancheria"
                + "\n 1)Xis Mondongo"
                + "\n 2)Semente dos Delzez"
                + "\n 3)Suco Gummy"
                + "\n 4)Crepe Aperea"
                + "\n 5)Sair");

        lanche.setCodigo(input.nextInt());

        lanche.mostrarProduto();

    }
}
