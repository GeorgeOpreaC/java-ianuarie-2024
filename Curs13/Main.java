package Curs13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/**Random*/
//        Random random= new Random();
//        System.out.println(random.nextInt(1,100));

//        Scanner scanner = new Scanner(System.in);

//
//        int numarUtilizator = scanner.nextInt();
//        System.out.println("Numarul primit este:" +numarUtilizator);

          /** Math*/
      //    Math math = new Math();
          int numarulMaxim = Math.max(1,30);
        System.out.println(numarulMaxim);


        /** array*/
        int[] arrayNou = new int[]{10,20,30};
        int numarElemente= arrayNou.length;
        System.out.println(numarElemente);

        String[] listaDeFructe = {"Mar", "Para","Banana"};
       // System.out.println(listaDeFructe[1]);
       //  int [][] numarElementeMatrice = {{1,2},{3,4}, {5,6}};
      //  System.out.println(numarElementeMatrice[0][0]);
       // System.out.println(numarElementeMatrice.length);

        for (int index = 0; index<listaDeFructe.length;index++){
    //        System.out.println(listaDeFructe[index]);

        }
        for (String fruct: listaDeFructe){
        //    System.out.println(fruct+ "FOR");

        }
        String[] listaCopiataFructe = Arrays.copyOfRange(listaDeFructe,0,1000);
        for (String fructCopiat: listaCopiataFructe){
            System.out.println(fructCopiat);
        }
        String variabilaNull= null; //!=""

        Arrays.sort(listaDeFructe);
        for (String fruct :listaDeFructe){
            System.out.println(fruct);
        }
    }

}
