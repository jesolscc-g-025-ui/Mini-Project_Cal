package Project1.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import static Project1.Server.SimpleServer.PORT;
import static java.lang.System.out;

public class MultiServer {
    public SimpleServer SimpleServer;
    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket( PORT);
        out.println("Server running & waiting for client connections.");
        while(true) {
            try {
                Socket socket = s.accept();
                out.println("Connection: " + socket);

                Runnable r = new SimpleServer(socket);
                Thread task = new Thread(r);
                task.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}
}
