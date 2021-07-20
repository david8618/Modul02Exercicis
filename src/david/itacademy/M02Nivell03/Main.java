package david.itacademy.M02Nivell03;

import sun.jvm.hotspot.runtime.Threads;

public class Main {
    /*
    En aquest exercici es proposa un exercici complex de comprovacions i bucles per crear un cronòmetre  digital que vagi
    mostrant el temps transcorregut en format rellotge hh:mm:ss amb un segon d'espera.
    Només necessites 3 variables int (hour, minutes, seconds)
    El cronòmetre ha de tenir 6 dígits en tot moment i ha d'iniciar a 00:00:00
    L’aplicació no ha de finalitzar mai.
    Per que el rellotge trigui un segon has d’implementar: Thread.sleep(1000);
     */
    public static void main(String[] args) throws InterruptedException {

        //Creació tres variables horas, minuts i segons. Les inicialitzem
        int hores=0, minuts=0, segons=0;


        //Como que l'aplicació no ha de finalitzar mai, utilitzarem un bucle while que deixarem sempre en true
        while(true){

            //Mostrem el digitis del rellotge
            if(hores<10) System.out.print("0");
            System.out.print(hores+" : ");
            if(minuts<10) System.out.print("0");
            System.out.print(minuts+" : ");
            if(segons<10) System.out.print("0");
            System.out.println(segons);

            //Aumentem les variables de temps
            segons++;
            if(segons==60){
                segons=0;
                minuts++;
                if(minuts==60){
                    minuts=0;
                    hores++;
                    if(hores==24){
                        hores=0;
                    }
                }
            }

            //Apliquem la clase Theards perque el rellotge esperi 1seg.
            Thread.sleep(1000);

            //Aquesta clase requereix de fer us de les exepciones.

        }

    }
}
