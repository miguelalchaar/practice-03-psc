import java.util.Scanner;

public class ExpressaoAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para 'n': ");
        int n = sc.nextInt();

        int soma = 0;

        for (int x = 1; x <= n; x++) {
            soma += Math.pow(x, x);
        }
            System.out.println("O resultado de S(" + n + ") é: " + soma);

            sc.close();
        }
        
    }
    

