package programaaprovacaoemprestimo;
import java.util.Scanner;

public class ProgramaAprovacaoEmprestimo {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double valorhora, renda;
    int horatrabalhada;
    
    System.out.println("QUAL O VALOR DA HORA TRABALHADA? ");
    valorhora = input.nextDouble();
        System.out.println("QUANTAS HORAS FORAM TRABALHADAS? ");
        horatrabalhada = input.nextInt();
            renda = (valorhora*horatrabalhada);
if(renda >= 1500){
    System.out.println("EMPRESTIMO APROVADO");
}else{
    System.out.println("EMPRESTIMO REPROVADO");
}
    }
        }