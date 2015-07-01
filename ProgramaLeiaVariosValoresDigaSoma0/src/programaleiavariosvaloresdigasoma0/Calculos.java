package programaleiavariosvaloresdigasoma0;

import java.util.Scanner;

public class Calculos {

    public double valor;
    public double soma;

    public Calculos(double valor, double soma) {
        this.valor = valor;
        this.soma = soma;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double calcularSoma() {
        Scanner input = new Scanner(System.in);
        while (this.valor != 0) {
            this.valor = input.nextDouble();
            this.soma = this.valor + this.soma;
        }
        return this.soma;
    }
}
