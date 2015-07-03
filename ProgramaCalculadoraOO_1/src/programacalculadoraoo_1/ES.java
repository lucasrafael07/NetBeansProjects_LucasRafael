/*
 ES(Teclado e tela)
 +lerReal(mensagem:String):double
 +exibir(mensagem:Object):void
 */
package programacalculadoraoo_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ES {

    Scanner input = new Scanner(System.in);

    public double lerReal(String msg) {
        this.exibir(msg);
        return input.nextDouble();
    }

    public void exibir(Object msg) {
        exibir(msg);
    }

}
