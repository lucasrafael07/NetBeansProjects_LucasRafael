package programaresultadoaocubo;
import java.util.Scanner;

public class ProgramaResultadoAoCubo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int valor,resultadoCubo;

System.out.println("INFORME O VALOR: ");
valor = input.nextInt();

resultadoCubo = ((valor*valor*valor));

System.out.println("O VALOR DO RESULTADO AO CUBO: " + resultadoCubo);
}
}
