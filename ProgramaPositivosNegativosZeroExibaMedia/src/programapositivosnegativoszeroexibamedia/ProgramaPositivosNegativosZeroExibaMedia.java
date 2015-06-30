package programapositivosnegativoszeroexibamedia;

import java.util.Scanner;



public class ProgramaPositivosNegativosZeroExibaMedia {

public static void main(String[] args) {
    
int valor = -1;
int cont = -1;
int soma = 0;

Scanner input = new Scanner(System.in);

while(valor !=0){
System.out.println("DIGITE UM VALOR INTEIRO, PARA SABER A MEDIA, DIGITE O NUMERO '0': ");
valor = input.nextInt();
    soma = soma+valor;
    cont++;
    }
System.out.println("A média entre os valores digitados é :"+(soma/cont));
}
    }