/*
 Calculadora(CPU)
 +somar (v1:double,v2:double):double
 +dividir(v1:double,v2:double):double
 +multiplicar(v1:double,v2:double):double
 +percentual(v1:double,v2:double):double
 +exponencial(v1:double,v2:double):double
 */
package programacalculadoraoo_1;

import javax.swing.JOptionPane;

public class Calculadora {

    public double somar(double v1, double v2) {
        return v1 + v2;
    }

    public double dividir(double v1, double v2) {
        return v1 / v2;
    }

    public double multiplicar(double v1, double v2) {
        return v1 * v2;
    }

    public double percentual(double v1, double v2) {
        return (v1 * v2) / 100;
    }

    public double exponencial(double v1, double v2) {
        double resp = 1;
        for (int i = 0; i < v2; i++) {
            return resp = v1 * resp;
        }
        return resp;
    }

}
