/*8­ Faça um programa que leia o código do produto de acordo com a tabela
1­ Xis Mondongo ­ $5
2­ Crepe Capivara ­ $3
3­ Suco Gummy ­ $2
4­ Semente do s delzes ­ $6
5­ Sair
Quando o usuário selecionar o código sair o programa deve mostrar quantas unidades de
cada produto foi selecionada e o total vendido.*/

package programaleiacodigoprodutodigatotalselecionados;

import java.util.Scanner;

public class ProgramaLeiaCodigoProdutoDigaTotalSelecionados {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int contadora = 0;//variavel contadora dos produtos
double valorTotal = 0;//variavel que acumula o valor total do pedido
int codigo = 0;//variavel codigo

while(codigo !=5){//enquanto for diferente de 5, ele fica perguntando qual produto selecionar
System.out.println("Informe um código e faça seu pedido: ");
codigo = input.nextInt();

    if(codigo == 1){
    System.out.println("Xis Mondongo");
    contadora ++;
    valorTotal = valorTotal + 5;
    }
    if(codigo == 2){
    System.out.println("Crepe Capivara");
    contadora ++;
    valorTotal = valorTotal + 3;
    }
    if(codigo == 3){
    System.out.println("Suco Gummy");
    contadora ++;
    valorTotal = valorTotal + 2;
    }
    if(codigo == 4){
    System.out.println("Semente dos delzes");
    contadora ++;
    valorTotal = valorTotal + 6;
    }
    else if(codigo == 5){//diz a quantidade dos produtos e o valor total do mesmo
    System.out.println("Total de produtos: "+contadora+", Valor total do pedido:R$ "+valorTotal);
    }
}
    }
        }