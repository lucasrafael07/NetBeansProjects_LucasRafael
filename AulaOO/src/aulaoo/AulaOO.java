package aulaoo;

public class AulaOO {

    public static void main(String[] args) {

        /*
        
         String nome = "Gabriela";
         int idade = 12;
         long cpf = 2222;

         System.out.println("Nome: " + nome+"\n"
         + "Idade: " + idade+"\n"
         + "CPF: " + cpf);
        
         //Metodo Estruturado
        
         */
        Aluno a = new Aluno("Lucas", 29, 2222, "Técnico Info", "Renato", 75, 60);
        //Metodo Orientado ao Objeto invocando classe Aluno
        a.Imprimir();
        System.out.println(a.toString());

    }

}