package MetodFabricStatic;

public class Teste2 {
    private Channel ch;
    private Packet pk;

    public Teste2(ComunicationFactory factory){
        this.ch = factory.createChannel();
        this.pk = factory.createPacket();
    }

    public void connectar(){
        this.ch.getMessage();
        this.pk.sendPacket();
    }

}
