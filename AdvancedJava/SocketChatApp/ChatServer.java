package SocketChatApp;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String clientMsg, serverMsg;

            while (true) {

                clientMsg = input.readLine();

                if (clientMsg == null || clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }

                System.out.println("Client: " + clientMsg);

                System.out.print("You: ");
                serverMsg = keyboard.readLine();
                output.println(serverMsg);

                if (serverMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close(); 
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}