package Homework24H25;
//-Create a method that takes a Day enum as a parameter
// and uses a switch case statement to print a message depending on the day input.

public class Main {
    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRYDAI,SATURDAY,SUNDAY
    }
    public static void printMessage(Day day){
        switch(day){
            case MONDAY:
                System.out.println("Este luni.Incepe o noua saptamana");
                break;
                case TUESDAY:
                    System.out.println("Este marti.");
                    break;
                    case WEDNESDAY:
                        System.out.println("Este miercuri.Jumatatea saptamanii");
                        break;
                        case THURSDAY:
                            System.out.println("Este joi.Aproape de sfarsitul saptamanii");
                            break;
                            case FRYDAI:
                                System.out.println("Este vineeri.Se apropie weekendul");
                                break;
                                case SATURDAY:
                                    System.out.println("Este sambata.Ne bucuram de weekend");
                                    break;
                                    case SUNDAY:
                                        System.out.println("Este duminica.Astazi ne relaxam");
                                        break;
            default:
                System.out.println("Nu a fost introdusa o zi valida");
                break;
        }
    }
    //Testam metoda
    public static void main(String[] args) {
        printMessage(Day.MONDAY);
        printMessage(Day.WEDNESDAY);
        printMessage(Day.SATURDAY);
        printMessage(Day.valueOf("FRIDAY"));
    }
}
