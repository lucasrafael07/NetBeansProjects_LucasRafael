package programacontadoraobjeto;

public class Contadora {

    private int valor;

    public Contadora(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void ContarAte() {
        for (int cont = 0; cont <= valor; cont++) {
            System.out.println(cont);
        }
    }
}
