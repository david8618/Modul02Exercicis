package david.itacademy.M02Nivell02;

import java.util.Scanner;

public class Main {
    /*
    Crea una aplicació que dibuixi una escala de nombres,
    sent cada línia nombres començant en un i acabant en el nombre de la línia.

    Crea una aplicació que dibuixi una piràmide invertida de asteriscs.
    Nosaltres li vam passar l'altura de la piràmide per teclat. Aquest és un exemple:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Primera part
        int e;
        System.out.println("Digita els nombres que vols que tingui l'escala: ");
        e=sc.nextInt();
        System.out.print("Escala de nombres:");
        for (int i = 1; i <=e; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
        }
        System.out.println("\n--------------------");
        //Segona part
        int n;
        //Demanen al usuari a alçada de la piràmide

        System.out.println("¿Quina alçada vols que tingui la piràmide?");
        n=sc.nextInt();
        System.out.println("La Piràmide invertida amb una alçada de " + n +" :");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1-i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
