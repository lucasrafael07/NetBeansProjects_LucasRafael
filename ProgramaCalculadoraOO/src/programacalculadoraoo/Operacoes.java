package programacalculadoraoo;

public class Operacoes {

    public double resultado;

    public double somar(double valor1, double valor2) {
        this.resultado = valor1 + valor2;
        return resultado;
    }

    public double subtrair(double valor1, double valor2) {
        this.resultado = valor1 - valor2;
        return resultado;
    }

    public double dividir(double valor1, double valor2) {
        this.resultado = valor1 / valor2;
        return resultado;
    }

    public double multiplicar(double valor1, double valor2) {
        this.resultado = valor1 * valor2;
        return resultado;
    }

    public double porcentagem(double valor1, double valor2) {
        this.resultado = (valor1 * valor2) / 100;
        return resultado;
    }

    public double expoente(double valor1, double valor2) {
        this.resultado = Math.pow(valor1, valor2);
        return resultado;
    }

    public double expoente2(double valor1, double valor2) {
        double resp = 1;
        for (int i = 0; i < valor2; i++) {
            resp = valor1 * resp;
            this.resultado = resp;
        }
        return resultado;
    }
}
