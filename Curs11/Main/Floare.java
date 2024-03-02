package Curs11.Main;

public class Floare {
/**Carcateristici*/

    int numarPetale;
    String culoare;
    String miros;
    boolean areGhiveci;

    /**
     * Constructor
     */

    Floare() {

    }


    Floare(int numarPetaleParam, String culoareParam) {

        this.numarPetale = numarPetaleParam;
        this.culoare = culoareParam;
        System.out.println("Am constructorul cu 3 parametrii");
    }

    /**Metode*/
    int metodaCareIntoarce10(){
        return 10;
    }
    String metodaCareIntoarceString(){
        return "Returnez String";
    }
    void metodaCareNuReturneazaNimic(){
        System.out.println("Metoda nu returneaza nimic");
    }

    /**Getter & Setter*/

    int getNumarPetale(){
        return numarPetale;
    }

    void setNumarPetale(int numarPetaleParametru){
        this.numarPetale= numarPetaleParametru;
    }

    /**    */
}

