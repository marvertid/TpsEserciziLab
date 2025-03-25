import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Inserire una lettera, una virgola e il numero di volta che si vuole ripetere: ");
        String input = in.readLine();

        byte[] packetData = input.getBytes();
        DatagramPacket packet = new DatagramPacket(packetData, packetData.length, InetAddress.getByName("localhost"), 8080);
        socket.send(packet);

        DatagramPacket respPacket = new DatagramPacket(new byte[255], 255);
        socket.receive(respPacket);

        String received = new String(respPacket.getData(), 0, respPacket.getLength());

        System.out.println("Dati ricevuti: " + received);

        socket.close();
    }
}
