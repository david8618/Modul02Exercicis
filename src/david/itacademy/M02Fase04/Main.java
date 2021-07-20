package david.itacademy.M02Fase04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    - Fase 4
    Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
    Fusiona les dues llistes en una sola.
    A més, afegeix una posició amb un espai buit entre la primera i la segona.
    És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
    FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
     */
    public static void main(String[] args) {
        //Llista
        List<Character> nom = Arrays.asList('D','a','v','i','d');
        List<Character> cognom = Arrays.asList('D','í','a','z');
        List<Character> fullName= new ArrayList<>();
        //Afegim la llista nom
        fullName.addAll(nom);
        //Afeguim el caracter ' '
        fullName.add(' ');
        //Afeguim la llista cognom
        fullName.addAll(cognom);
        //Imprimim per pantalla el fullName
        System.out.println(fullName);

    }
}
