package Project1.Client;

import java.awt.print.Printable;
import java.io.*;
import java.net.Socket;

public class Connect {
    private PrintWriter out;
    private BufferedReader in;
    private final int PORT = 5000;

    public  Connect() throws IOException {

        try{
            Socket socket = new Socket("localhost", 5000);
            PrintStream out = new PrintStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
