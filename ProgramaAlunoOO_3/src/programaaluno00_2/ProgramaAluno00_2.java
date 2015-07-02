package programaaluno00_2;

public class ProgramaAluno00_2 {

    public static void main(String[] args) {

        ES es1 = new ES();
        ES es2 = new ES();
        Aluno a1 = new Aluno("Sem nome", 0);
        Aluno a2 = new Aluno("Sem nome", 0);
        Calculos calc = new Calculos();

        a1.setNome(es1.lerPalavra("Digite nome"));
        a1.setNota(es2.lerReal("Digite nota"));
        a2.setNome(es1.lerPalavra("Digite outro nome"));
        a2.setNota(es2.lerReal("Digite outranota"));

        es1.exibir("Média=" + calc.calcularMedia(a1.getNota(), a2.getNota()));
        es1.exibir("Maior nota=" + calc.maior(a1.getNota(), a2.getNota(), a1.getNome(), a2.getNome()));
        es1.exibir(a1.toString());
        es1.exibir(a2.toString());
    }
}
