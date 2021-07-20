package david.itacademy.M02Fase03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
    - Fase 3
    Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
    Has de recòrrer l'array anterior i anar comptant el número de vegades que apareix cada caràcter.
     */
    public static void main(String[] args) {
        //Llista
        List<Character> nom = Arrays.asList('d','a','v','i','d');

        //<Character, Integer> equivalent a <Clau, valor>
        HashMap<Character,Integer> lletres = new HashMap<>();
        //Variable per contar els valors
        int contador=0;

        for (int i = 0; i < nom.size(); i++) {
            if(lletres.containsKey(nom.get(i))){
                contador = lletres.get(nom.get(i));
                contador++;
                lletres.put(nom.get(i), contador);
            }else {
                lletres.put (nom.get(i), 1); // la clave no existeix, afegeix-l'ha
            }
        }

        for (Map.Entry<Character, Integer> mostrar: lletres.entrySet()){
            System.out.println("Clau: '" + mostrar.getKey() + "', Valor: " + mostrar.getValue());
        }
    }
}
