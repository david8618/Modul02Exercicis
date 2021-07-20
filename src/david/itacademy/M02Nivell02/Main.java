package david.itacademy.M02Nivell02;

public class Main {
    /*
    Crea una aplicació que dibuixi una escala de nombres,
    sent cada línia nombres començant en un i acabant en el nombre de la línia.

    Crea una aplicació que dibuixi una piràmide invertida de asteriscs.
    Nosaltres li vam passar l'altura de la piràmide per teclat. Aquest és un exemple:
     */
    public static void main(String[] args) {

        //Primera part
        System.out.print("Escala de nombres:");
        for (int i = 1; i <=8; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
        }
        System.out.println("\n--------------------");
        //Segona part
        System.out.println("Piràmide invertida:");
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 8-1-i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
