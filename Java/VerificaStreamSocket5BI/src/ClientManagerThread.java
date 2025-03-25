import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public class ClientManagerThread extends Thread {
    private Socket socket;
    public ClientManagerThread(Socket socket) {
        this.socket = socket;
    }

    static LinkedList<String> carte = new LinkedList<String>();

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String input = in.readLine();
            System.out.println(input);


            switch (input) {
                case "s":
                    input = in.readLine();
                    System.out.println(input);
                    carte.add(input);
                    break;
                case "r":
                    input = in.readLine();
                    System.out.println(input);
                    if (Integer.parseInt(input) > carte.size()) {
                        out.println("Non ci sono abbastanza carte!");
                    } else {
                        for (int i = 0; i < Integer.parseInt(input); i++) {
                            out.println(carte.pop());
                        }
                    }
            }

            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
