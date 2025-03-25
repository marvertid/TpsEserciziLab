import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket socket = server.accept(); //socket che si occupa della comunicazione con il client
            new ClientManagerThread(socket).start();
        }

    }
}