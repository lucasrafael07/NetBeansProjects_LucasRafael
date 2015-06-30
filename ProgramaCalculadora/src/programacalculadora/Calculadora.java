package programacalculadora;

public class Calculadora {

    public double resultado;

    public void somar(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a soma dos conteúdos de numero1 e numero2
        this.resultado = numero1 + numero2;
    }

    public void subtrair(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a subtração dos conteúdos de numero1 e numero2
        this.resultado = numero1 - numero2;
    }

    public void dividir(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a divisão dos conteúdos de numero1 e numero2
        this.resultado = numero1 / numero2;
    }

    public void multiplicar(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a multiplicação dos conteúdos de numero1 e numero2
        this.resultado = numero1 * numero2;
    }

    public void porcentagem(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a porcentagem dos conteúdos de numero1 e numero2
        this.resultado = (numero1 * numero2) / 100;
    }

    public void expoente(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a porcentagem dos conteúdos de numero1 e numero2
        this.resultado = Math.pow(numero1, numero2);// Usa a função Expoente
    }

    public void expoente2(double numero1, double numero2) {
// A variável ou notação resultado armazenará ou receberá a porcentagem dos conteúdos de numero1 e numero2

       for (int i = 1; i <= numero2; i++) {
            double resp = numero1 * i;
            this.resultado = resp;

            // Usa a função Expoente
        }

    }
}
