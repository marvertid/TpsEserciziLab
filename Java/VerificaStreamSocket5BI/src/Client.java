import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        int n = 0;
        do {
            System.out.println("Inserire s per aggiungere una carta o r per toglierla: ");
            input = stdIn.readLine();
            out.println(input);
        } while(!input.equals("r") && !input.equals("s"));

        switch (input) {
            case "r":
                System.out.println("Quante carte vuoi sottrarre: ");
                while(true) {
                    try {
                        input = stdIn.readLine();
                        n = Integer.parseInt(input);
                        System.out.println(n);
                        if (n > 0)
                            break;
                        else
                            System.out.println("Inserire un numero maggiore di zero");
                    } catch (NumberFormatException e) {
                        System.out.println("Inserire un numero valido");
                    }
                }

                out.println(input);
                for (int i = 0; i < n; i++) {
                    System.out.println(in.readLine());
                }
                break;
            case "s":
                System.out.println("Inserire la carta da aggiungere: ");
                input = stdIn.readLine();
                out.println(input);
                break;
        }

        in.close();
        out.close();
        socket.close();
        stdIn.close();
    }
}
