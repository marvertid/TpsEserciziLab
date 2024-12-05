import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public class ClientManagerThread extends Thread  {
    private Socket socket;
    private LinkedList<Float> listaMedieClient = new LinkedList<Float>();
    private LinkedList<Integer> ListaNumeri = new LinkedList<Integer>();
    public ClientManagerThread(Socket socket, LinkedList<Float> lista) {
        this.socket = socket;
        this.listaMedieClient = lista;
    }
    public void run() {
        String input = "";
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true
            );

            while (!input.equals("q")) {
                input = in.readLine();
                System.out.println("Il client ha scritto: " + input);
                if (!input.equals("q"))
                    ListaNumeri.add(Integer.parseInt(input));
                out.println(ListaNumeri);
            }

            float sum = 0;
            for (Integer num: ListaNumeri) {
                sum += num;
            }

            out.println("La media dei numeri in questo client e`: " + sum/ListaNumeri.size());
            synchronized (listaMedieClient) {
                listaMedieClient.add(sum/ListaNumeri.size());
            }

            sum = 0;
            for (Float num: listaMedieClient) {
                sum += num;
            }

            out.println("La media di tutti i numeri tra i client e`: " + sum/listaMedieClient.size());




            out.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
