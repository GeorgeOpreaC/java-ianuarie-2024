package Curs11.Main;

public class Student {

    int legitimatie;
    String profilfacultate;
    String uniforma;
    String nume;

    public Student( int legitimatieP, String profilfacultateP, String uniformaP, String numeP){
        this.legitimatie= legitimatieP;
        this.profilfacultate= profilfacultateP;
        this.uniforma= uniformaP;
        this.nume=numeP;
    }

    public  Student(){
        String nume= " ";
        String profilfacultate= " ";

    }
    int getLegitimatie(){
        return  legitimatie;
    }
    void setLegitimatie(int legitimatieNOUA){
        this.legitimatie= legitimatieNOUA;
    }
}
