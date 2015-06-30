package programaintroaobjetos;

public class classePrincipal {

    public static void main(String[] args) {

        TV televisao1 = new TV();

        System.out.println("Está televisão é da marca " + televisao1.fabricante + ".A televisao está "
                + (televisao1.ligado == true ? "Ligada" : "Desligada") + ". O volume é " + televisao1.volume);

        televisao1.ligar();
        televisao1.aumentarVolume();
        televisao1.aumentarVolume();

        System.out.println("Está televisão é da marca " + televisao1.fabricante + ".A televisao está "
                + (televisao1.ligado == true ? "Ligada" : "Desligada") + ". O volume é " + televisao1.volume);

    }

}
