package programaretangulo;

public class ProgramaRetangulo {
    public static void main(String[] args) {
    int base,altura,area,perimetro;
    
    base = 5;
    altura = 4;
    perimetro = (2*base+2*altura);
    area = (base*altura);
    
    System.out.println("O VALOR DO PERIMETRO É: " + perimetro + " E O VALOR DA AREA É: " + area);
    }
}