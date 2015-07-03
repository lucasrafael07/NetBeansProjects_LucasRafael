/**
 * Classe Identidade, nesta classe são instanciados as variáveis pertinentes aos
 * dados do questionário referente ao primeiro Alien.
 */
package programaalienigenaoo;

public class Identidade {

    private String nome;
    private String raca;
    private String planeta;
    private double altura;
    private double peso;

    public Identidade(String nome, String raca, String planeta, double altura, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.planeta = planeta;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Identidade{" + "Nome = " + nome + ", Raça = " + raca + ", Planeta = " + planeta + ", Altura = " + altura + ", Peso = " + peso + '}';
    }

}
