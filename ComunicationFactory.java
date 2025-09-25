package MetodFabricStatic;

public interface ComunicationFactory {
    Channel createChannel();
    Packet createPacket();
}
