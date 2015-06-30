// Intervalo           Signo
// de 22/12 ate 20/1   Capricornio
// de 21/1 ate 19/2    Aquario
// de 20/2 ate 20/3    Peixes
// de 21/3 ate 20/4    Aries
// de 21/4 ate 20/5    Touro
// de 21/5 ate 20/6    Gemeos
// de 21/6 ate 21/7    Cancer
// de 22/7 ate 22/8    Leao
// de 23/8 ate 22/9    Virgem
// de 23/9 ate 22/10   Libra
// de 23/10 ate 21/11  Escorpiao
// de 22/11 ate 21/12  Sagitario


package programasigno;

import java.util.Scanner;

public class ProgramaSigno  {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int mes,dia;

      System.out.println ("Informe o dia de nascimento: ");
      dia = input.nextInt();

      System.out.println ("Informe o mês de nascimento: ");
      mes = input.nextInt();
      
if (((mes==12)&&((dia>=22)&&(dia<=31))) ||
     ((mes==1)&&((dia>=1)&&(dia<=20))))
    System.out.println("Seu Signo é Capricornio");
    
    else if (((mes==1) && ((dia>=21) && (dia<=31))) ||
            ((mes==2) && ((dia>=1) && (dia<=19))))
    System.out.println("Seu Signo é Aquario");

    else if (((mes==2) && ((dia>=20) && (dia<=29))) ||
            ((mes==3) && ((dia>=1) && (dia<=20))))
    System.out.println("Seu Signo é Peixes");

    else if (((mes==3) && ((dia>=21) && (dia<=31))) ||
            ((mes==4) && ((dia>=1) && (dia<=20))))
    System.out.println("Seu Signo é Aries");

    else if (((mes==3) && ((dia>=21) && (dia<=31))) ||
            ((mes==4) && ((dia>=1) && (dia<=20))))
    System.out.println("Seu Signo é Aries");

    else if (((mes==4) && ((dia>=21) && (dia<=30))) ||
            ((mes==5) && ((dia>=1) && (dia<=20))))
    System.out.println("Seu Signo é Touro");

    else if (((mes==5) && ((dia>=21) && (dia<=31))) ||
            ((mes==6) && ((dia>=1) && (dia<=20))))
    System.out.println("Seu Signo é Gemeos");

    else if (((mes==6) && ((dia>=21) && (dia<=30))) ||
            ((mes==7) && ((dia>=1) && (dia<=21))))
    System.out.println("Seu Signo é  Cancer");

    else if (((mes==7) && ((dia>=22) && (dia<=31))) ||
            ((mes==8) && ((dia>=1) && (dia<=22))))
    System.out.println("Seu Signo é Leao");

    else if (((mes==8) && ((dia>=23) && (dia<=31))) ||
            ((mes==9) && ((dia>=1) && (dia<=22))))
    System.out.println("Seu Signo é Virgem");

    else if (((mes==9) && ((dia>=23) && (dia<=30))) ||
            ((mes==10) && ((dia>=1) && (dia<=22))))
    System.out.println("Seu Signo é Libra");

    else if (((mes==10) && ((dia>=23) && (dia<=31))) ||
            ((mes==11) && ((dia>=1) && (dia<=21))))
    System.out.println("Seu Signo é Escorpião");

    else if (((mes==11) && ((dia>=22) && (dia<=30))) ||
            ((mes==12) && ((dia>=1) && (dia<=21))))
    System.out.println("Seu Signo é Sargitário");
else System.out.println("ERRO: dia ou mes de nascimento invalidos !!!");
    }
}
