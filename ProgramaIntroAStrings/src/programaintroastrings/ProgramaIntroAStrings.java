package programaintroastrings;
import java.util.Scanner;

public class ProgramaIntroAStrings {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("QUAL SEU PRIMEIRO NOME? ");
String primeiroNome = input.next();

System.out.println("QUAL SEU ULTIMO NOME? ");
String ultimoNome = input.next();

System.out.println("QUAL SUA IDADE? ");
int idade = input.nextInt();

System.out.println("Olá "+ primeiroNome + " "+ ultimoNome+ " de " + idade+ " anos.");
}
    }
