public class AtributosDaConta {

        String modelo;
        String cor;
        int carga;
        boolean tampa;
        float ponta;



        void status(){
                System.out.println("--> A cor da sua caneta é: " + this.cor);
                System.out.println("--> sua caneta é da marca: " + this.modelo);
                System.out.println("--> Sua caneta tem a numeração: " + this.ponta);
                System.out.println("--> A carga da sua caneta está com " + this.carga +"%");
        }
        void tampar(){
            this.tampa = true;
        }

        void destampar(){
                this.tampa = false;

        }
        void rabiscar(){
                if(this.tampa == true){
                        System.out.println("--> Sua caneta está tampada, não pode Escrever.");
                }else{
                        System.out.println("--> Sua caneta está destampada, pode Escrever.");
                }



        }

}
