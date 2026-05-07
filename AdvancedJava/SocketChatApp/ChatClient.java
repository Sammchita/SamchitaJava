package SocketChatApp;
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {

        Socket socket = null;
        BufferedReader input = null;
        PrintWriter output = null;
        BufferedReader keyboard = null;

        try {
            socket = new Socket("localhost", 5000);

            input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            output = new PrintWriter(socket.getOutputStream(), true);

            keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String serverMsg, clientMsg;

            System.out.println("Connected to server!");

            while (true) {

                System.out.print("You: ");
                clientMsg = keyboard.readLine();
                output.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }

                serverMsg = input.readLine();

                if (serverMsg == null || serverMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Server closed connection.");
                    break;
                }

                System.out.println("Server: " + serverMsg);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (keyboard != null) keyboard.close();
                if (input != null) input.close();
                if (output != null) output.close();
                if (socket != null) socket.close(); // ✅ FIX HERE
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}