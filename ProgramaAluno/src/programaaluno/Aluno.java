package programaaluno;

public class Aluno {

    private String nome1, nome2;
    private double nota1, nota2;

    public Aluno(String nome1, String nome2, double nota1, double nota2) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public String Maior() {
        String resultado = "";
        if (nota1 > nota2) {
            resultado = nome1 + " " + nota1;
        } else {
            resultado = nome2 + " " + nota2;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome1=" + nome1 + ", nome2=" + nome2 + ", nota1=" + nota1 + ", nota2=" + nota2 + '}';
    }
}
