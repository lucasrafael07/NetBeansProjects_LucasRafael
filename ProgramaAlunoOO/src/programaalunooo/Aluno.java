package programaalunooo;

public class Aluno {

    private String nome1, nome2;
    private int nota1, nota2, nota3, nota4;

    public Aluno(String nome1, String nome2, int nota1, int nota2, int nota3, int nota4) {

        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;

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

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public double media1() {
        return (nota1 + nota2) / 2;

    }

    public double media2() {
        return (nota3 + nota4) / 2;

    }

    public String maior() {
        String resultado = "";
        if (this.media1() > this.media2()) {
            resultado = "O aluno de maior nota é: " + nome1 + " e sua média é: " + this.media1();
        } else {
            resultado = "O aluno de maior nota é: " + nome2 + " e sua média é: " + this.media2();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome1=" + nome1 + ", nome2=" + nome2 + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + '}';
    }

}
