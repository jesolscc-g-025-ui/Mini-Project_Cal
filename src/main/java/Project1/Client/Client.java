//package Project1.Client;
//
//import javax.sound.sampled.Port;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Client {
//
//    public void start(final int port,final Scanner scanner){
//
//        try(Socket socket1 = new Socket("localhost",port);
//
//            PrintWriter writer = new PrintWriter(socket1.getOutputStream(),true)){
//            System.out.println("Connecting to server port: " + socket1.getPort());
//            String UserInput = scanner.nextLine();
////            while(!UserInput.isEmpty()){
//
////            }
//
//        } catch (IOException e) {
//                    System.err.println("Error accepting client connection: " + e.getMessage());
//            ;
//        }
//
//
//
//    }
//}
