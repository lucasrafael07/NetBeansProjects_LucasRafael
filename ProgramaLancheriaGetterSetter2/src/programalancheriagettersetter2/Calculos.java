package programalancheriagettersetter2;
//Objeto onde é defino o Switch

public class Calculos {

    public void selecionarCod(int codigo) {
        switch (codigo) {
            case 1:
                System.out.println("XIS BUGIO");
                break;
            case 2:
                System.out.println("CREPE DE FIAMBRE");
                break;
            case 3:
                System.out.println("SUCO DE SANGA");
                break;
            case 4:
                System.out.println("LASANHA DE URU");
                break;
            default:
                System.out.println("CÓDIGO INVALIDO");
                break;
        }

    }

}
