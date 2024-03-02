package Curs11.Main;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /** Am creat un obiect floare/ o instanta Floare*/
        Floare lalea= new Floare();
     int numarul10 = lalea.metodaCareIntoarce10();
        System.out.println(numarul10);

        lalea.numarPetale =30;
        System.out.println(lalea.numarPetale);


        String variabilaAnimal = "Leu    ";
        System.out.println(variabilaAnimal.trim().toUpperCase());
        variabilaAnimal.toUpperCase();

        lalea.setNumarPetale(30);
        System.out.println(lalea.getNumarPetale());


        String variabila2= variabilaAnimal + "String nou";
        String obiectString=" ";
                StringBuilder variabilaStringBuilder= new StringBuilder("acolade");
    }


}
