package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner (System.in);


    public void letra () {
     System.out.println(" Informe a Letra!! ");
     String letra = sc.next();
     String tipoLetra = "";
     switch (letra) {
        case "a": tipoLetra="vogal";
        break;
        case "e": tipoLetra="vogal";
        break;
        case "i": tipoLetra="vogal";
        break;
        case "o": tipoLetra="vogal";
        break;
        case "u": tipoLetra="vogal";
        break;
        default: tipoLetra="consoante";
        break;
     }
     System.out.println(letra + " é uma " +tipoLetra);
    }
    
    public void mes () {
     System.out.println(" Informe o mês (Número) ");
     int numeroMes = sc.nextInt();
     String nomeMes = "";
     switch (numeroMes) {
        case 1: nomeMes= "Janeiro";
        break;
        case 2: nomeMes= "Fevereiro";
        break;
        case 3: nomeMes="Março";
        break;
        case 4: nomeMes="Abril";
        break;
        case 5: nomeMes="Maio";
        break;
        case 6: nomeMes="Junho";
        break;
        case 7: nomeMes="Julho";
        break;
        case 8: nomeMes="Agosto";
        break;
        case 9: nomeMes="Setembro";
        break;
        case 10: nomeMes="Outubro";
        break;
        case 11: nomeMes="Novembro";
        break;
        case 12: nomeMes="Dezembro";
        break;
        default: nomeMes="Não existe";
        break;
     }
     System.out.println(numeroMes + " é o mês de " + nomeMes );
    }
}
