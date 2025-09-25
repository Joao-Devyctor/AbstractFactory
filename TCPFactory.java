package MetodFabricStatic;

    public class TCPFactory implements ComunicationFactory {
        @Override
        public Channel createChannel() {
            return new TCPChannel();
        }

        @Override
        public Packet createPacket() {
            return new TCPPacket();
        }
    }

