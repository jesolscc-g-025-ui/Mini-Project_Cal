package Project1.Server;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class Server extends Thread{

    private final int port = 5000;

    public void start(){
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Starting Server......");

            Socket ClientSocket = serverSocket.accept();
            System.out.println("New Client Connected at port: " +
                    "\nIP ADDRESS : " + ClientSocket.getInetAddress() +
                    "\n PORT: " + port);




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
