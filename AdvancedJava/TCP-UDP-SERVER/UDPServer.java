import java.net.*;

public class UDPServer {
    public static void main(String[] args) {

        try {
            DatagramSocket socket = new DatagramSocket(5000);

            byte[] receiveData = new byte[1024];

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);

            socket.receive(receivePacket);

            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Client: " + message);

            String response = "Message received (UDP Server)";

            byte[] sendData = response.getBytes();

            InetAddress ip = receivePacket.getAddress();
            int port = receivePacket.getPort();

            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, ip, port);

            socket.send(sendPacket);

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}