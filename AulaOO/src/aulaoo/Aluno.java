package aulaoo;

public class Aluno {

    private String nome;
    private int idade;
    private long cpf;
    private String curso;
    private String professor;
    private double n1;
    private double n2;
    private double media;//alt+insert usado o metodo toString que retorna os valores das variaveis

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", curso=" + curso + ", professor=" + professor + ", n1=" + n1 + ", n2=" + n2 + ", media=" + media + '}';
    }

    public Aluno(String nome, int idade, long cpf, String curso, String professor, double n1, double n2) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.curso = curso;
        this.professor = professor;
        this.n1 = n1;
        this.n2 = n2;

    }

    public void Imprimir() {
        this.media = (this.n1 + this.n2) / 2;//calculo da media

        System.out.println("Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Curso: " + this.curso + "\n"
                + "Professor: " + this.professor + "\n"
                + "Média: " + this.media);
    }
}
