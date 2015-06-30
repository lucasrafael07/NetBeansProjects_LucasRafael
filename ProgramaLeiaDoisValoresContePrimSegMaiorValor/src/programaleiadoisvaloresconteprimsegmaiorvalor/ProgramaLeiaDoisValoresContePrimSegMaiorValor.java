package programaleiadoisvaloresconteprimsegmaiorvalor;

import java.util.Scanner;

public class ProgramaLeiaDoisValoresContePrimSegMaiorValor {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("DIGITE O PRIMEIRO VALOR? ");
    int valor1 = input.nextInt();

    System.out.println("DIGITE O SEGUNDO VALOR? ");
    int valor2 = input.nextInt();
    
    if(valor1<valor2){
        int contador = valor1;
        while(contador <= valor2){
                System.out.println(contador);
                                ++contador;}
                                                }
    else if(valor1>valor2){
        int contador = valor1;
        while(contador >= valor2){
                System.out.println(contador);
                                --contador;}
        }
            }
                }