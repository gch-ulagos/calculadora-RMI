import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class cliente {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            calculadora c = (calculadora) Naming.lookup("//localhost/calculadora");
     while (true) {
        String menu = JOptionPane.showInputDialog("Calculadora\n\n"
                    + "Ingrese 1 para suma\n"
                    + "Ingrese 2 para resta\n"
                    + "Ingrese 3 para multiplicar\n"
                    + "Ingrese 4 para dividir\n"
        );

        switch (menu) {
            case "1": {
                int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la suma"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la suma")); 

                JOptionPane.showMessageDialog(null, "La suma es:" + c.sumar(x,y));
                break;
            }
            case "2": {
                int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la resta"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la resta")); 

                JOptionPane.showMessageDialog(null, "La resta es:" + c.restar(x,y));
                break;
            }
            case "3": {
                int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la multiplicacion"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la multiplicacion")); 

                JOptionPane.showMessageDialog(null, "El producto es:" + c.multiplicar(x,y));
                break;
            }
            case "4": {
                int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la division"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la division")); 

                JOptionPane.showMessageDialog(null, "El cociente es:" + c.dividir(x,y));
                break;
            }
            }
        }
        }
        catch(Exception e) {
            System.out.print("Servidor no conectado" + e);
        }
    }
}