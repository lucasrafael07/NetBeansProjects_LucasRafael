/**
 * Objeto que controla as perguntas feitas ao usuário.
 */
package programaalienigenaoo;

public class Questionario {

    Identidade a = new Identidade("Nome indefinido", "Raça Indefinida", "Planeta Indefinido", 0, 0);
    Identidade b = new Identidade("Nome indefinido", "Raça Indefinida", "Planeta Indefinido", 0, 0);
    ES es = new ES();

    public Object imprimir() {
        a.setNome(es.lerString("DIGITE O NOME DO 1º ALIEN: "));
        a.setRaca(es.lerString("QUAL A RAÇA DO 1º ALIEN: "));
        a.setPlaneta(es.lerString("DIGITE O NOME DO PLANETA: "));
        a.setAltura(es.lerDouble("DIGITE A ALTURA DO ALIEN: "));
        a.setPeso(es.lerDouble("DIGITE O PESO DO ALIEN: "));
        b.setNome(es.lerString("DIGITE O NOME DO 2º ALIEN: "));
        b.setRaca(es.lerString("QUAL A RAÇA DO 2º ALIEN: "));
        b.setPlaneta(es.lerString("DIGITE O NOME DO 2º PLANETA: "));
        b.setAltura(es.lerDouble("DIGITE A ALTURA DO 2º ALIEN: "));
        b.setPeso(es.lerDouble("DIGITE O PESO DO 2º ALIEN: "));
        Object imprimir = null;

        System.out.println(a.toString());
        System.out.println(b.toString());
        return imprimir;
    }

}
