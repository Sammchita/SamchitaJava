package CircleArea;
import java.io.*;
import java.net.*;

public class AreaClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            // Step 1: Take radius from user
            System.out.print("Enter radius: ");
            String radius = keyboard.readLine();

            // Step 2: Send radius to server
            output.println(radius);

            // Step 3: Receive area from server
            String area = input.readLine();

            System.out.println("Area of circle is: " + area);

            // Close connections
            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
