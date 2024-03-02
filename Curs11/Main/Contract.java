package Curs11.Main;

public class Contract {

    String tipContract;
    int numarPagini;
    String semnaturaContract;

    boolean contractoficial;
     String setTipcontract;


    public Contract(String tipContractP, int numarPaginiP, String semnaturaContractP, boolean contractoficialP){

        this.tipContract= tipContractP;
        this.numarPagini= numarPaginiP;
        this.semnaturaContract= semnaturaContractP;
        this.contractoficial= contractoficialP;



}

    public Contract (){

        String tipContractP= " " ;
        String semnaturaP= " " ;

    }



    int getNumarPagini(){
        return numarPagini;
    }
    void setTipcontract(String ContractBazat){
        this.setTipcontract=ContractBazat;
    }
}
