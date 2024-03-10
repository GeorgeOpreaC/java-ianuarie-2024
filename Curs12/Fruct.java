package Curs12;

public class Fruct {

    int numarFructe;
     String culoare;
    String forma;
    boolean gust;

    Fruct(int numarFructeParam,String culoareParam, String formaParam,boolean gustParam){

        this.numarFructe= numarFructeParam;
        this.culoare= culoareParam;
        this.forma=formaParam;
        this.gust= gustParam;

    }

    int getNumarFructe()
    {return numarFructe;}
    void setNumarFructe(int numarFructeParam){this.numarFructe=numarFructeParam;}

    String setCuloare(int getculoareParam) {
        System.out.println("Am rulat metoda 1");
        return  culoare;
    }

    }





