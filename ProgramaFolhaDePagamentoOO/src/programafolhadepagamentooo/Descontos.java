package programafolhadepagamentooo;

public class Descontos {

    private double sb, vt, inss, sl, vl;
    int prodhoras;

    public Descontos(double sb, double vt, double inss, double sl, double vl, int prodhoras) {
        this.sb = sb;
        this.vt = vt;
        this.inss = inss;
        this.sl = sl;
        this.vl = vl;
        this.prodhoras = prodhoras;
    }

    public double getVl() {
        return this.vl;
    }

    public void setVl(double vl) {
        this.vl = vl;
    }

    public int getHorasTrabalhadas() {
        return this.prodhoras;
    }

    public void setHorasTrabalhadas(int prodhoras) {
        this.prodhoras = prodhoras;
    }

    public double salarioBruto() {
        this.sb = this.prodhoras * this.vl;
        return this.sb;
    }

    public double valeTransporte() {
        this.vl = (this.sb * 6 / 100);
        return this.vl;
    }

    public double inss() {
        this.inss = (this.sb * 11 / 100);
        return this.inss;
    }

    public double salarioLiquido() {
        this.sl = this.sb - this.vt - this.inss;
        return this.sl;
    }

    @Override
    public String toString() {
        return "Descontos{" + "Salário Base = " + sb + ", Vale Transporte = " + vt + ", INSS = " + inss + ", Salário Líquido = " + sl +"\n"+
                ", Vale Trasnporte = " + vl + ", Valor Hora Trabalhada = " + prodhoras + '}';
    }

}
