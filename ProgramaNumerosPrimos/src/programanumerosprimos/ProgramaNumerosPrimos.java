package programanumerosprimos;/*nome do pacote em que o codigo fonte se encontra
author:Lucas Monteiro,Alex Machado*/

import java.util.Scanner;//importando biblioteca Scanner

public class ProgramaNumerosPrimos {//publicando a Classe do projeto
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in);//Instanciando objeto Scanner

int numero,cont; //declarando variaveis numero e contadora
  
System.out.println("INFORME UM NUMERO: ");//pergunta o numero
  numero = input.nextInt();//alocando informação na variavel numero
    cont=0;//declarando o valor da variavel cont
  
  for (int i=1;i<=numero;i++ ){//declarando a condição para informar 
   if(numero%i == 0)           //se o numero é ou nao primo, com variavel integradora
   cont=cont+1;
  }
  if (cont==2){
      System.out.println("O NUMERO " +numero+ " É PRIMO");//mostra a msg ao usuario se o valor for primo
  }else{
   System.out.println("O NUMERO " +numero+ " NÃO É PRIMO");//mostra a msg ao usuario se o valor não for primo
  }
 }
}
    
  
