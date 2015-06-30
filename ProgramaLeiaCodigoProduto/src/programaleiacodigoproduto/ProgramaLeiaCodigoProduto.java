/**
 * Faça um programa que leia o codigo do produto e retorne o nome correspondente
 * ao codigo conforme abaixo: 1 - Suco Gummy 2 - Semente dos Delzes 3 - Crepe de
 * Apreá 4 - Xis Mondongo 5 - Codigo Inválido
 */
package programaleiacodigoproduto;

import java.util.Scanner;// importando objeto Scanner

/**
 * Criação da Classe ProgramaLeiaCodigoProduto
 *
 * @author saulo
 */
public class ProgramaLeiaCodigoProduto {

    /**
     * Metodo Principal do Projeto
     */
    public static void main(String[] args) {// metodo principal

        Scanner input = new Scanner(System.in);// instanciando objeto Scanner;

        int codigo;// criar variavel codigo do produto;

        System.out.println("Informe um código");// perguntar ao usuario o codigo;
        codigo = input.nextInt();               // ler a resposta do usuario;

        if (codigo == 1) {// declarar a condição SE codigo 1 dizer a resposta abaixo;
            System.out.println("Suco gummy");
        }
        if (codigo == 2) {// declarar a condição SE codigo 2 dizer a resposta abaixo;
            System.out.println("Semente dos Delzes");
        }
        if (codigo == 3) {// declarar a condição SE codigo 3 dizer a resposta abaixo;
            System.out.println("Crepe de Apreá");
        }
        if (codigo == 4) {// declarar a condição SE codigo 4 dizer a resposta abaixo;
            System.out.println("Xis Mondongo");
        }
        if (codigo == 5) {// declarar a condição SE codigo 5 retornar codigo invalido
            System.out.println("Código Inválido");

        }
    }
}// fim do programa
