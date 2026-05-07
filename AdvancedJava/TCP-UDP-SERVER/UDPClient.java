import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {

        try {
            DatagramSocket socket = new DatagramSocket();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter message: ");
            String msg = sc.nextLine();

            byte[] sendData = msg.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");

            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, ip, 5000);

            socket.send(sendPacket);

            byte[] receiveData = new byte[1024];

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);

            socket.receive(receivePacket);

            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Server: " + response);

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}