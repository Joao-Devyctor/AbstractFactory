package MetodFabricStatic;

public class UDPFactory implements ComunicationFactory{
    @Override
    public Channel createChannel() {
        return new UDPChannel();
    }

    @Override
    public Packet createPacket() {
        return new UDPPacket();
    }
}
