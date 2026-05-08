import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost/CalculatorService", new CalculatorImpl());
            System.out.println("Server is ready...");
            

            CalculatorImpl obj = new CalculatorImpl();

            Naming.rebind("rmi://localhost/CalculatorService", obj);

            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}