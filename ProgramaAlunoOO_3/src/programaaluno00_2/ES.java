package programaaluno00_2;

import java.util.Scanner;

public class ES {

    Scanner sca = new Scanner(System.in);

    public void exibir(Object mensagem) {
        System.out.println(mensagem);
    }

    public String lerPalavra(String mensagem) {
        this.exibir(mensagem);
        return sca.nextLine();
    }

    public double lerReal(String mensagem) {
        this.exibir(mensagem);
        return sca.nextDouble();
    }
}
