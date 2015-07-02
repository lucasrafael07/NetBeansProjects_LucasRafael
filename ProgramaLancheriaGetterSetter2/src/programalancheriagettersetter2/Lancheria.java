package programalancheriagettersetter2;
//Objeto onde é definifo o codigo;

public class Lancheria {

    public int codigo;

    public Lancheria(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Lancheria{" + "codigo=" + codigo + '}';
    }

}
