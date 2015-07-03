/*
 Valores(RAM)
 v1:double
 v2:double
 */
package programacalculadoraoo_1;

public class Valores {

    private double v1, v2;

    public Valores(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Valores{" + "v1=" + v1 + ", v2=" + v2 + '}';
    }

}
