package Homework30H31;
//-For a list of strings, create a method that filters out strings with fewer than 5 characters,
// then converts each string to uppercase,
// and finally sorts them in reverse order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> Cuvinte=new ArrayList<>();
        Cuvinte.add("Floare");
        Cuvinte.add("Apa");
        Cuvinte.add("Urs");
        Cuvinte.add("Pas");
        //Filtram string-urile cu mai putin de 5 carcatere
        List<String> Cuvinte2=Cuvinte.stream().filter(s ->s.length()<5).collect(Collectors.toList());
        System.out.println("Strings with less than 5 characters are: "+Cuvinte2);
        for (int i=0; i<Cuvinte2.size(); i++) {
            String s = Cuvinte2.get(i);
            String upperCase=s.toUpperCase();
            Cuvinte.set(i, upperCase);

        }
        System.out.println("UpperCase: "+Cuvinte);
        Collections.sort(Cuvinte,Collections.reverseOrder());
        System.out.println("List after the use of Collection.reverseOrder():\n"+Cuvinte);
    }
}
