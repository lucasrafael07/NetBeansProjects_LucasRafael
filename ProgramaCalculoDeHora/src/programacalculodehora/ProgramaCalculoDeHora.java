package programacalculodehora;

public class ProgramaCalculoDeHora {
    
    public static void main(String[] args) {
    
    long totalMilisegundos = System.currentTimeMillis() - 10800000;/* Era Unix, 
    neste caso 10800000 sao 3 horas convertidas
    em milisegundos fazendo esta subtração temos o horario atual 
    com o fuso do Brasil */
    long totalSegundos = totalMilisegundos/1000;/* 1000 milisegundos = a 1 seg
    todos segundos que se passaram desde 1970*/
    long segundoAtual = totalSegundos % 60; //Obter o valor de segundos atuais
    
    long totalMinutos = totalSegundos/60;//Todos min que se passaram desde 1970
    long minutoAtual = totalMinutos % 60;//Obter o valor de minutos atuais
    
    long totalHora = totalMinutos/60;
    long horaAtual = totalHora % 24;
    
    System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);
}
    }
