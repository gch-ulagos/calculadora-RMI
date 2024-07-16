import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class calculadorarmi extends UnicastRemoteObject implements calculadora {

public calculadorarmi() throws RemoteException {
    int a,b;
    }
    @Override
    public double sumar(double a, double b) throws RemoteException
    {
        return a + b;
    }
    @Override
    public double restar(double a, double b) throws RemoteException
    {
        return a - b;
    }
    @Override
    public double multiplicar(double a, double b) throws RemoteException
    {
        return a * b;
    }
    @Override
    public double dividir(double a, double b) throws RemoteException
    {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
