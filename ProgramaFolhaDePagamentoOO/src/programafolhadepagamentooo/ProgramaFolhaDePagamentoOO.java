package programafolhadepagamentooo;

public class ProgramaFolhaDePagamentoOO {

    public static void main(String[] args) {

        Descontos a = new Descontos(0, 0, 0, 0, 0, 0);
        Leitura b = new Leitura();

        a.setHorasTrabalhadas(b.lerInteiro("QUANTAS HORAS FORAM TRABALHAS: "));
        a.setVl(b.lerDouble("QUAL O VALOR DA HORA TRABALHADA: "));
        System.out.println("O SALARIO BRUTO É: R$" + a.salarioBruto());
        System.out.println("O VALOR DESCONTADO DO VALE TRANSPORTE É: R$" + a.valeTransporte());
        System.out.println("O O VALOR DESCONTADO DO INSS É: R$" + a.inss());
        System.out.println("O SALARIO LIQUIDO É: R$" + a.salarioLiquido());
    }

}
