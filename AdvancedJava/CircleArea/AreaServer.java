package CircleArea;
import java.io.*;
import java.net.*;

public class AreaServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Step 1: Receive radius from client
            String radiusStr = input.readLine();
            double radius = Double.parseDouble(radiusStr);

            // Step 2: Calculate area
            double area = 3.1416 * radius * radius;

            // Step 3: Send result back to client
            output.println(area);

            System.out.println("Area calculated and sent to client: " + area);

            // Close connections
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
