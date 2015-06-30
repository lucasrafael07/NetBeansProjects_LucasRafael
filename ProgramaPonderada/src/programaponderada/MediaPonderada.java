package programaponderada;

public class MediaPonderada {

    private int a;
    private int b;
    private int c;
    private int p1;
    private int p2;
    private int p3;
    private int resultado;

    public MediaPonderada(int a, int b, int c, int p1, int p2, int p3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void CalcularPonderada() {
        this.resultado = this.a * this.p1 + this.b * this.p2 + this.c * this.p3 / 3;
        System.out.println(this.resultado);

    }

}
