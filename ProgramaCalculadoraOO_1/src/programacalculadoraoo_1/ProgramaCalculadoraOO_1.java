/*
 ProgramaCalc...(JAR OU EXE)
 +main(args[]:String):void
 */
package programacalculadoraoo_1;

import javax.swing.JOptionPane;

public class ProgramaCalculadoraOO_1 {

    public static void main(String[] args) {

        ES es = new ES();
        Valores val = new Valores(0, 0);
        Calculadora calc = new Calculadora();

        val.setV1(es.lerReal("DIGITE O 1º VALOR:"));
        val.setV2(es.lerReal("DIGITE O 2º VALOR:"));
        es.exibir("SOMA=" + calc.somar(val.getV1(), val.getV2()));
        es.exibir("DIVIDIR=" + calc.dividir(val.getV1(), val.getV2()));
        es.exibir("MULTIPLICAR=" + calc.multiplicar(val.getV1(), val.getV2()));
        es.exibir("PORCENTAGEM=" + calc.percentual(val.getV1(), val.getV2()));
        es.exibir("EXPOENTE=" + calc.exponencial(val.getV1(), val.getV2()));

    }
}
