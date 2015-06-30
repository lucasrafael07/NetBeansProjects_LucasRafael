package programaleiavariosvaloresquandozeromostreproduto;

import java.util.Scanner;

public class ProgramaLeiaVariosValoresQuandoZeroMostreProduto {


public static void main(String[] args) {
    
int valor = 1;
int produto = 1;
int resultado = 0;

Scanner input = new Scanner(System.in);

while(valor>=0){
System.out.println("DIGITE UM VALOR INTEIRO, PARA SABER O PRODUTO, DIGITE UM NUMERO NEGATIVO");
valor = input.nextInt();
produto = produto*valor;
if (valor<0);
resultado = produto/valor;
}
System.out.println("A produto dos valores digitados é :"+resultado);
    }
}