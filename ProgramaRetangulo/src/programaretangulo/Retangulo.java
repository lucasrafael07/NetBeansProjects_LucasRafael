package programaretangulo;

public class Retangulo {

    private int altura;
    private int area;
    private int base;
    private int perimetro;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    public void calcularArea() {
        this.area = this.base * this.altura;
        System.out.println("Area do Retangulo é = " + this.area);
    }

    public void calcularPerimetro() {
        perimetro = 2 * base * 2 * altura;
        System.out.println("Perimetro do Retangulo é = " + this.perimetro);
    }
}
