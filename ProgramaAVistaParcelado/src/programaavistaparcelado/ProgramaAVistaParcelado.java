package programaavistaparcelado;

import java.util.Scanner;//importado a classe Scanner

public class ProgramaAVistaParcelado {

public static void main(String[] args) {
    
Scanner input = new Scanner(System.in);//instanciando o objeto scanner

System.out.println("Digite o valor do Produto: ");//perguntar ao usuario o valor do produto
double valorAvista = input.nextDouble();

System.out.println("Dividir em quantas Parcelas: ");//perguntar ao usuario a quantidade de parcelas que se quer dividir
int parcela = input.nextInt();

int i = 1; //variavel contadora
    double valorParcela; //variavel que recebera o valor da parcela
        double valorParcelaJuros; //variavel que recebera o valor da parcela com juros

while (i<=parcela) //enquanto o contador for <= a parcela o comando repete
    if (parcela<=10){ // se a parcela for em menos de 10 vezes é feito o calculo abaixo
    valorParcela = (valorAvista/parcela);
    valorParcelaJuros = valorParcela + ((valorParcela*10)/100);// acrescentado 10% de juros em cada parcela
    System.out.println(i+"º" + " Parcela" + " o valor é de :R$ "+valorParcelaJuros);
    System.out.println("O valor sem juros da parcela é de R$ "+valorParcela);
    i++;//acrescenta 1 ao valor da variavel contadora em cada repetição do comando
    }
    else if (parcela>10){// senao se a parcela for em menos de 10 vezes é feito o calculo abaixo
    valorParcela = (valorAvista/parcela);
    valorParcelaJuros = valorParcela + ((valorParcela*20)/100);// acrescentado 20% de juros em cada parcela
    System.out.println(i+"º" + " Parcela" + " o valor é de :R$ "+valorParcelaJuros);//informo o valor das parcelas c/juros
    System.out.println("O valor sem juros da parcela é de R$ "+valorParcela);//informo o valor das parcelas s/juros
    i++;//acrescenta 1 ao valor da variavel contadora em cada repetição do comando
}
    }
        }