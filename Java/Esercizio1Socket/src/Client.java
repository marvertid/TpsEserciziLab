import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);


        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in)
        );

        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true
        );
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        System.out.println("Inserire messaggio: ");
        String input = stdin.readLine();
        out.println(input);
        String echo = in.readLine();
        System.out.println(echo);
        in.close();
        out.close();
        stdin.close();
        socket.close();
    }
}
