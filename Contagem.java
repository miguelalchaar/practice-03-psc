public class Contagem {
    public static void main(String[] args) {

        for (int numero = 233; numero <= 456; ) {
            System.out.println(numero);

            if (numero + 3 <= 400 && numero >= 300) {
                numero += 3;
            } else {
                numero += 5;
            }
        }
    }
    
}
