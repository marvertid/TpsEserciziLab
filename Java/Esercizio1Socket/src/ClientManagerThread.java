import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientManagerThread extends Thread  {
    private Socket socket;
    public ClientManagerThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = null;
        try {
            out = new PrintWriter(
                    socket.getOutputStream(), true
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String input = null;
        try {
            input = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Gestione Input dal client

        String output = inputHandling(input);

        System.out.println("Il client ha scritto: " + input);
        out.write(output);

        out.close();
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String inputHandling(String input) {
        String output = null;
        if (input.equals("D")) {
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            output = "Orario Server: " + date.format(formatter);
        } else if (input.charAt(0) == 'L' && input.charAt(1) == ' ') {
            output = "Lunghezza stringa: " + input.substring(1).length();
        } else if (input.equals("Q")) {
            output = "Chiusura server...";
        }

        return output;
    }
}
