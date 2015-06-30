/*9 - Faça um programa que mostre a tabuada do nove (sem utilizar * com laço “for”), 
 * apenas concatenando valores como strings. */
package programatabuadacomfor;

/**
 * @author lucas
 */
public class ProgramaTabuadaComFor {

    public static void main(String[] args) {

        int valor = 0;
        int aux = 9;

        for (int i = 1; i < 10; i++) {

            valor = valor + aux;/*enquanto i for menor que 10 ele começa em 
             0+9,9+9,18+9,27+9... e assim por diante ate o i atingir o valor de 9
             dai o comando para*/

            System.out.println(i + "x9 = " + valor);
        }

    }

}
