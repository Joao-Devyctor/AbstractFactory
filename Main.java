package MetodFabricStatic;

public class Main {
    public static void main(String[] args) {

        ComunicationFactory factory = new UDPFactory();

        Teste1 t1 = new Teste1(factory);

        System.out.println("Executando com a família de produtos UDP:");
        t1.connectar();


        System.out.println("\n-----------------------------------\n");

        factory = new TCPFactory();
        Teste1 t1_tcp = new Teste1(factory);

        System.out.println("Executando com a família de produtos TCP:");
        t1_tcp.connectar();
    }
}