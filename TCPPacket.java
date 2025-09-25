package MetodFabricStatic;

public class TCPPacket implements Packet {
    @Override
    public void sendPacket() {
        System.out.println("Enviando pacote TCP");
    }
}
