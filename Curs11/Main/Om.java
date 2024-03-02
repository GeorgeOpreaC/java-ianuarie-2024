package Curs11.Main;



    public class Om {
        String nume;
        int varsta;
        int CNP;
        boolean par;

        public Om(String NumeP, int varstaP, int CNP, boolean parP) {
            this.CNP = CNP;
            this.varsta = varstaP;
            this.nume = NumeP;
            this.par = parP;

        }


         public Om() {
                float CNP = 503024;
                String nume = " ";


            }


            int getVarsta () {
                return varsta;
            }
            void setCNP ( int CNPNOU ){
                this.CNP = CNPNOU;
            }
        }

