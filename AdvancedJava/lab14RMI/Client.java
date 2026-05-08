import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Calculator obj = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            int a = 10;
            int b = 5;

            System.out.println("Sum: " + obj.sum(a, b));
            System.out.println("Difference: " + obj.difference(a, b));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
