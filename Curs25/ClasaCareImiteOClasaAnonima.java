package Curs25;

import Curs24.CumparaturiInterface;

public class ClasaCareImiteOClasaAnonima implements CumparaturiInterface {
    @Override
    public void cumpara() {
        System.out.println("metoda cumpara() din clasaAnonima");
    }
}
