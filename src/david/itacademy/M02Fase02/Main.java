package david.itacademy.M02Fase02;

import java.util.Arrays;
import java.util.List;

public class Main {
    /*
        - Fase 2
        Canvia la taula per una llista (List<Character>)
        Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
        Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
         */

    public static void main(String[] args) {
        //Llista
        List<Character> nom = Arrays.asList('d','a','v','i','d');
        //Array de vocals, consontants
        char[] vocals = {'a','e','i','o','u'};
        char[] consonants ={'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};

        //Comprobem si dintra de la Llista hi han vocals,consonants o numeros.
        for (int i = 0; i < nom.size(); i++) {
            for (int v = 0; v < vocals.length; v++) {
                if(nom.get(i)==vocals[v]){
                    System.out.println(nom.get(i) + " es una Vocal.");
                }
            }
            for (int c = 0; c < consonants.length; c++) {
                if (nom.get(i) == consonants[c]) {
                    System.out.println(nom.get(i) + " es una Consonant.");
                }
            }
            if(Character.isDigit(nom.get(i))==true) System.out.println("Els noms de personas no contenen números!");
        }

    }
}
