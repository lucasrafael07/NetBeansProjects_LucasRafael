/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaleiacodigoprodutoswitch;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ProgramaLeiaCodigoProdutoSwitch {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int codigo;

System.out.println("Informe um código: ");
codigo = input.nextInt();

switch(codigo){
    case 1:
    System.out.println("Suco Gummy");
    break;
    case 2:
    System.out.println("Semente doz delzez");
    break;
    case 3:
    System.out.println("Xis Mondongo");
    break;
    case 4:
    System.out.println("Crepe Aprea");
    break;
    
    default:
    System.out.println("Código Inválido");
    //qualquer opçao menos 1 a 4
}
    }   
        }