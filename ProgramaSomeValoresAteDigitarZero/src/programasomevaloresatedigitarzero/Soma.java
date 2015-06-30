package programasomevaloresatedigitarzero;

public class Soma {

    private int valorInicial;
    private int resultado;

    public Soma(int valorInicial, int soma) {
        this.valorInicial = valorInicial;
        this.resultado = resultado;
    }

    public void setvalorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getvalorInicial() {
        return valorInicial;
    }

    public void somaNumeros() {
        int resul = 0;
        do {
            resul = resul + valorInicial;
        } while (valorInicial != 0);
        System.out.println("DIGITE O VALOR");
        resul = resul + valorInicial;
        System.out.println(resul);
    }
}
