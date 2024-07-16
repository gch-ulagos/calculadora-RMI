import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class servidor {

    public static void main(String[] args) {
        try {
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registry.rebind("calculadora", new calculadorarmi());

            JOptionPane.showMessageDialog(null, "Conectado al servidor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar al servidor" + e);
        }
    }
}