package programaaluno00_2;

public class Calculos {

    public double calcularMedia(double valor1, double valor2) {
        return (valor1 + valor2) / 2;//+GR
    }

    public String maior(double valor1, double valor2, String texto1, String texto2) {
        String resultado = "";
        if (valor1 == valor2) {
            resultado = "Iguais \n" + texto1 + "\n" + valor1 + "\n" + texto2 + "\n" + valor2;
        } else if (valor1 > valor2) {
            resultado = texto1 + "\n" + valor1;
        } else {
            resultado = texto2 + "\n" + valor2;
        }
        return resultado;
    }

}
