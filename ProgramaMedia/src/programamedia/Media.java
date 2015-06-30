package programamedia;

public class Media {

    private int v1;
    private int v2;
    private int resultado;

    public Media(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.resultado = resultado;

    }

    public void calcularMedia() {
        this.resultado = this.v1 + this.v2 / 2;
        System.out.println(this.resultado);
    }

}
