package programatriplo;

public class Triplo {

    private int valor;
    private int resultado;

    public Triplo(int valor) {
        this.valor = valor;
        this.resultado = resultado;

    }

    public void CalcularTriplo() {
        this.resultado = this.valor * 3;
        System.out.println(this.resultado);
    }
}
