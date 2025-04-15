import java.util.Scanner;

public class PesquisaHabitantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maiorIdade = 0;
        int menorIdade = 500;
        int contadorEspecial = 0;
        
        while(true) {
            // Verificação sexo
            char sexo;
            do {
                System.out.println("Digite seu sexo ('f' ou 'm'): ");
                sexo = sc.next().charAt(0);

                if (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M') {

                    System.out.println("=== Valor Inválido === \n Tente novamente: \n");
                }

            } while (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');

            System.out.println("----------------------------------------------------------------");
             
            // Verificação cor dos olhos
            char olhos;
            do {
                System.out.println("\nDigite a cor dos seus olhos ('a' = azul, 'v' = verde ou 'c' = castanhos):");
                olhos = sc.next().charAt(0);

                if (olhos != 'a' && olhos != 'A' &&
                olhos != 'v' && olhos != 'V' &&
                olhos != 'c' && olhos != 'C') {

                    System.out.println("=== Valor Inválido === \n Tente novamente: \n");
                }

            } while (olhos != 'a' && olhos != 'A' &&
                     olhos != 'v' && olhos != 'V' &&
                     olhos != 'c' && olhos != 'C');

            System.out.println("----------------------------------------------------------------");

            // Verificação cor dos cabelos
            char cabelos;
            do {
                System.out.println("\nDigite a cor dos seus cabelos ('l' = louros, 'p' = preto ou 'c' = castanhos): ");
                cabelos = sc.next().charAt(0);

                if (cabelos != 'l' && cabelos != 'L' &&
                    cabelos != 'p' && cabelos != 'P' &&
                    cabelos != 'c' && cabelos != 'C') {

                    System.out.println("=== Valor Inválido === \n Tente novamente: \n");
                }

            } while (cabelos != 'l' && cabelos != 'L' &&
                     cabelos != 'p' && cabelos != 'P' &&
                     cabelos != 'c' && cabelos != 'C');

            System.out.println("----------------------------------------------------------------");

            // Verificação idade
            int idade;
            do {
                System.out.println("\nDigite sua idade (0 - 500) ou -1 para sair: ");
                idade = sc.nextInt();

                if ((idade < 0 || idade > 500) && idade != -1) {

                    System.out.println("=== Valor Inválido === \n Tente novamente: \n");
                }

            } while ((idade < 0 || idade > 500) && idade != -1);
            
            if (idade == -1) {
                break;
            }
           
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
           
            if ((sexo == 'f' || sexo == 'F') && 
               idade >= 18 && idade <= 35 && 
               (olhos == 'v' || olhos == 'V') && 
               (cabelos == 'l' || cabelos == 'L')) {

                contadorEspecial++;
            }
            
        }
        
        // Dados obtidos
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n=== Resultados da Pesquisa ===");
        System.out.println("Maior idade encontrada: " + maiorIdade);
        System.out.println("Menor idade encontrada: " + menorIdade);
        System.out.println("Quantidade de mulheres 18-35 com olhos verdes e cabelos louros: " + contadorEspecial);
        
        sc.close();
    }
}