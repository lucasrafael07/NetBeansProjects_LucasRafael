package programaquadrado;

public class Quadrado {

    private int lado;
    private int area;
    private int perim;

    public Quadrado(int lado, int area, int perim) {

        this.lado = lado;
        this.area = area;
        this.perim = perim;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setPerim(int perim) {
        this.perim = area;
    }

    public int getPerim() {
        return perim;
    }

    public void calcularArea() {
        area = lado * lado;

    }

    public void calcularPerim() {
        perim = 4 * lado;

    }

}
