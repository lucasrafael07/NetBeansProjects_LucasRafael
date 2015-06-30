/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progquadrado;

/**
 *
 * @author E11-PROF-101
 */
public class Quadrado {

    private int lado;
    private int area;
    private int perim;

    public Quadrado(int lado, int area, int perim) {
        this.lado = lado;
        this.area = area;
        this.perim = perim;
    }

    public void calcularArea() {
        this.area = lado * lado;
        System.out.println("Área= " + area);
    }

    public void calcularPerim() {
        this.perim = 4 * lado;
        System.out.println("Perímetro= " + perim);
    }
}
