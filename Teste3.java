package MetodFabricStatic;

public class Teste3 {
    private Channel ch;
    private Packet pk;

    public Teste3(ComunicationFactory factory){
        this.ch = factory.createChannel();
        this.pk = factory.createPacket();
    }

    public void connectar(){
        this.ch.getMessage();
        this.pk.sendPacket();
    }
}
