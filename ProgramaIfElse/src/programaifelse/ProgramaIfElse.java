package programaifelse;
import java.util.Scanner;

public class ProgramaIfElse {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.println("QUAL SEU NOME? ");
    String nome = input.nextLine(); // nextLine le ate encontrar um quebra de linha.

    System.out.println("QUAL SUA IDADE? ");
    int idade = input.nextInt();

if(idade < 1) { //colocamos if seguido da variavel e condição (no caso se for menor e igual a 18)
    System.out.println(nome + " ,A IDADE INFORMADA NÃO É VALIDA."); //colocamos o que fazer se a codição for esperado ou nao.
}else if(idade < 18){
    System.out.println(nome + ", VOCÊ É MENOR DE IDADE.");
}else{
    System.out.println(nome + ", VOCÊ É MAIOR DE IDADE.");
}
    }
        }
