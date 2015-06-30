package programafatorial;

import java.util.Scanner;

public class ProgramaFatorial {

public static void main (String args[]){ 
Scanner input = new Scanner(System.in);

System.out.println("DIGITE UM NUMERO INTEIRO PARA VER SEU FATORIAL: ");
int valor = input.nextInt();// aqui criamos uma variável que irá armazenar o numero do fatorial 
int resultado = valor;// aqui criamos outra var. Será o resultado temporário da multiplicação 

while (valor > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves 

  resultado = resultado *(valor-1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1 
  valor--; // aqui decrementamos o valor de x em um, no final do loop 
  System.out.println(resultado); // Esse comando imprime o valor de f. O último será o valor final do Fatorial. 
} 
  } 
    }