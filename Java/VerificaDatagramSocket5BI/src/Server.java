import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8080);
        DatagramPacket packet = new DatagramPacket(new byte[255], 255);

        socket.receive(packet);
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Dati ricevuti: " + received);

        String carattere = received.split(",")[0];
        String numero = received.split(",")[1];

        String response = "";
        for (int i = 0; i < Integer.parseInt(numero); i++) {
            response += carattere;
        }

        byte[] packetData = response.getBytes();
        DatagramPacket respPacket = new DatagramPacket(packetData, packetData.length, packet.getAddress(), packet.getPort());
        socket.send(respPacket);

        socket.close();
    }
}