import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int x = sc.nextInt();

            System.out.println("--------------------------------------");

        int fatorial = 1;
        String operacao = x + "! = ";

        for (int numero = x; numero > 0; numero--) {
            fatorial *= numero;
            operacao += numero;

            if (numero > 1) {
                operacao += " * ";
            }
        }

        operacao += " = " + fatorial;

        System.out.println(operacao);
      
        sc.close();
    }
    
}
