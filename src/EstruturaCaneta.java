public class EstruturaCaneta {



    public static void main(String[] args){

        AtributosDaConta conta1 = new AtributosDaConta();
        conta1.cor = "Preta";
        conta1.ponta = 0.75f;
        conta1.modelo = "Jade Rasta";
        conta1.carga = 95;
        conta1.tampa = true;
        conta1.status();
        conta1.tampar();
        conta1.rabiscar();
        System.out.println("===============================================");
        AtributosDaConta conta2 = new AtributosDaConta();
        conta2.cor = "Vermelha";
        conta2.modelo = "Bic";
        conta2.ponta = 0.50F;
        conta2.tampa = false;
        conta2.carga = 78;
        conta2.status();
        conta2.destampar();
        conta2.rabiscar();
        System.out.println("=================================================");
        AtributosDaConta conta3 = new AtributosDaConta();
        conta3.cor = "Azul";
        conta3.ponta = 0.25f;
        conta3.tampa = true;
        conta3.modelo = "Lindas";
        conta3.carga = 75;
        conta3.status();
        conta3.tampar();
        conta3.rabiscar();



    }
}
