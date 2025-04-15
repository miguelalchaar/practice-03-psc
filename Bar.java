import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conta = 0;
        double taxaServico = 0.10;

        // Valor Inicial da conta
        System.out.print("Digite o valor inicial da sua conta: R$ ");
        conta = sc.nextDouble();

        // Valor da dose
        System.out.print("Digite o valor da dose: R$ ");
        double dose = sc.nextDouble();

        while (true) {
            System.out.println("\nVocê deseja ouvir mais um modão?");
            System.out.println("> 1) Sim");
            System.out.println("> 2) Não");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                conta += dose;
                double valorTaxa = conta * taxaServico;
                double contaComTaxa = conta + valorTaxa;

                System.out.printf("O valor total sem a Taxa de Serviço: R$ %.2f\n", conta);
                System.out.printf("O valor dos 10%% de Taxa de Serviço: R$ %.2f\n", valorTaxa);
                System.out.printf("O valor total com a Taxa de Serviço: R$ %.2f\n", contaComTaxa);
                
            } else if (opcao == 2) {
                double valorTaxaFinal = conta * taxaServico;
                double contaTotal = conta + valorTaxaFinal;

                System.out.println("Obrigado, volte sempre!");
                System.out.println("--------------------------------------------------");
                System.out.printf("Valor total sem a Taxa de Serviço: R$ %.2f\n", conta);
                System.out.printf("Valor dos 10%% de Taxa de Serviço: R$ %.2f\n", valorTaxaFinal);
                System.out.printf("Valor total com a Taxa de Serviço: R$ %.2f\n", contaTotal);
                break;

            } else {
                System.out.println("Opção inválida. Digite 1 para Sim ou 2 para Não.");
            }
        }

        sc.close();
    }
}