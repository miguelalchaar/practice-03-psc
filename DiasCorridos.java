import java.util.Scanner;

public class DiasCorridos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite a data mais antiga:");
        System.out.print("Dia: ");
        int diaAntigo = scanner.nextInt();
        System.out.print("Mês: ");
        int mesAntigo = scanner.nextInt();
        System.out.print("Ano: ");
        int anoAntigo = scanner.nextInt();

        System.out.println("-----------------------------------------------");

        System.out.println("Digite a data mais recente:");
        System.out.print("Dia: ");
        int diaAtual = scanner.nextInt();
        System.out.print("Mês: ");
        int mesAtual = scanner.nextInt();
        System.out.print("Ano: ");
        int anoAtual = scanner.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Dados obtidos: ");
        System.out.print("\nData antiga: " + diaAntigo + "/" + mesAntigo + "/" + anoAntigo);
        System.out.print("\nData recente : " + diaAtual + "/" + mesAtual + "/" + anoAtual);
        System.out.println("\n-----------------------------------------------");

       
        if (anoAntigo > anoAtual || (anoAntigo == anoAtual && mesAntigo > mesAtual) ||
           (anoAntigo == anoAtual && mesAntigo == mesAtual && diaAntigo > diaAtual)) {
            int guarda;

            guarda = diaAntigo; 
            diaAntigo = diaAtual; 
            diaAtual = guarda;


            guarda = mesAntigo; 
            mesAntigo = mesAtual; 
            mesAtual = guarda;


            guarda = anoAntigo; 
            anoAntigo = anoAtual; 
            anoAtual = guarda;
        }

        int totalDias = 0;

        //Enquanto a data antiga for diferente da data atual
        while (anoAntigo < anoAtual || (anoAntigo == anoAtual && mesAntigo < mesAtual) ||
              (anoAntigo == anoAtual && mesAntigo == mesAtual && diaAntigo < diaAtual)) {
            totalDias++;
            diaAntigo++;

            //Quantos dias possui o mês
            int diasDoMes = 31;
            
            if (mesAntigo == 4 || mesAntigo == 6 || mesAntigo == 9 || mesAntigo == 11) {
                diasDoMes = 30;

            } else if (mesAntigo == 2) {

                if ((anoAntigo % 4 == 0 && anoAntigo % 100 != 0) || (anoAntigo % 400 == 0)) {
                    diasDoMes = 29;
                } else {
                    diasDoMes = 28;
                }
            }

            //Próximo mês
            if (diaAntigo > diasDoMes) {
                diaAntigo = 1;
                mesAntigo++;
            }

            //Próximo ano
            if (mesAntigo > 12) {
                mesAntigo = 1;
                anoAntigo++;
            }
        }

        System.out.println("\nA diferença entre as datas é de " + totalDias + " dias.");

        scanner.close();
    }
}