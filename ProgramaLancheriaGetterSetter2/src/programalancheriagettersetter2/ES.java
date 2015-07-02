package programalancheriagettersetter2;
//Objeto onde é lido os dados do usuario;

import java.util.Scanner;

public class ES {

    Scanner input = new Scanner(System.in);

    public void exibir(Object mensagem) {
        System.out.println(mensagem);
    }

    public int lerInteiro(String mensagem) {
        this.exibir(mensagem);
        return input.nextInt();
    }

}
