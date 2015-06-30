package programaterço;

public class Terço {

    private int valor;
    private int resultado;

    public Terço(int valor) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public void CalcularTerço() {
        this.resultado = this.valor / 3;
        System.out.println(this.resultado);
    }

}
