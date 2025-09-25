package MetodFabricStatic;

public class Teste1 {
    private Channel ch;
    private Packet pk;

    public Teste1(ComunicationFactory factory){
        this.ch = factory.createChannel();
        this.pk = factory.createPacket();
    }

    public void connectar(){
        this.ch.getMessage();
        this.pk.sendPacket();
    }
}
