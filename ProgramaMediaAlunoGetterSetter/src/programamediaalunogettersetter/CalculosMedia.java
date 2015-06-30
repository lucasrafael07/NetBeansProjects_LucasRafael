package programamediaalunogettersetter;

public class CalculosMedia {

    private int n1, n2, resultado1, resultado2;
    public String nome1, nome2;

    public CalculosMedia(String nome1, String nome2, int n1, int n2, int n3, int n4, int resultado1, int resultado2) {
        this.n1 = n1;
        this.n2 = n2;
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome2() {
        return nome2;
    }

    public void setValor1(int n1) {
        this.n1 = n1;
    }

    public int getValor1() {
        return n1;
    }

    public void setValor2(int n2) {
        this.n2 = n2;
    }

    public int getValor2() {
        return n2;
    }

    public double calcularMedia1() {
        return (n1+n2)/2;
    }

  public String Maior(){
      
      
      
      
  }

    public void calcularMaior() {
        if (n1 > n2) {
            System.out.println(nome1 + ", SUA MÉDIA É: " + this.resultado1);
        } else {
            System.out.println(nome2 + ", SUA MÉDIA É: " + this.resultado2);
        }
    }
return resultado;
}
