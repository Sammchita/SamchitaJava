import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    public CalculatorImpl() throws RemoteException {
        super();
    }

    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }

    public int difference(int a, int b) throws RemoteException {
        return a - b;
    }
}
