package Curs12;

public class Leguma {


    int numarLegume;
    String culoare;
    String forma;
    boolean gust;

    Leguma(int numarLegumeParam, String culoareParam, String formaParam, boolean gustParam) {
        this.numarLegume = numarLegumeParam;
        this.culoare = culoareParam;
        this.forma = formaParam;
        this.gust = gustParam;
    }

    void culoareParam() {
        System.out.println("Am rulat metoda1");

    }

    void gustParam() {
        System.out.println("Am rulat metoda2");
    }

    int getNumarLegume() {
        return numarLegume;
    }

    String getCuloare() {
        return culoare;

    }
}




