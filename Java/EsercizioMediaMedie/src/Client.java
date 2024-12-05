import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8080);
        String input = "";
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in)
        );
        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true
        );
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        while (!input.equals("q")) {
            System.out.println("Inserire messaggio: ");
            input = stdin.readLine();
            out.println(input);

            String echo = in.readLine();
            System.out.println(echo);
        }
        String echo = in.readLine();
        System.out.println(echo);
        echo = in.readLine();
        System.out.println(echo);

        in.close();
        out.close();
        stdin.close();
        socket.close();
    }
}
