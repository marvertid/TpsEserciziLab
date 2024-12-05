import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        LinkedList<Float> lista = new LinkedList<Float>();
        while (true) {
            Socket socket = server.accept();
            new ClientManagerThread(socket, lista).start();
        }

    }
}