public class Multiplos {
    public static void main(String[] args) {
        int mult2 = 0, mult3= 0, mult5 = 0;
        
        for (int contador = 1; contador <= 1000; contador++){
            if (contador % 2 == 0) {
                mult2++;
            } if (contador % 3 == 0) {
                mult3++;
            } if (contador % 5 == 0) {
                mult5++;
            }
        }
        
        System.out.println("Múltiplos de 2: " + mult2);
        System.out.println("Múltiplos de 3: " + mult3);
        System.out.println("Múltiplos de 5: " + mult5);
    }

}