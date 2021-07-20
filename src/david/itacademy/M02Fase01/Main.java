package david.itacademy.M02Fase01;

public class Main {
    /*
    - Fase 1
    Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
    Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
     */

    public static void main(String[] args) {
        //taula de char
        char[]nom={'d','a','v','i','d'};

        //mostro la taula de char
        for (char mynom:nom) {
            System.out.print(mynom);
        }
    }
}
