package programalancheriagettersetter;

public class Lancheria {

    private int codigo;

    public Lancheria(int codigo) {
        this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void mostrarProduto() {

        switch (codigo) {
            case 1:
                System.out.println("Você escolheu: XIS MONDONGO");
                break;
            case 2:
                System.out.println("Você escolheu: SEMENTE DOS DELZES");
                break;
            case 3:
                System.out.println("Você escolheu: SUCO GUMMY");
                break;
            case 4:
                System.out.println("Você escolheu: CREPE APEREA");
                break;
            default:
                System.out.println("Você escolheu: CÓDIGO INVÁLIDO");
        }
    }
}
