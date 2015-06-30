package programaretangulo2;

public class Retangulo {

    private int base, altura, area, perim;

    public Retangulo(int base, int altura, int area, int perim) {
        this.base = base;
        this.altura = altura;
        this.perim = perim;
        this.area = area;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setPerim(int perim) {
        this.perim = perim;
    }

    public int getPerim() {
        return perim;
    }

    public void calcularArea() {
        area = base * altura;

    }

    public void calcularPerim() {
        perim = 2 * base + 2 * altura;

    }

}
