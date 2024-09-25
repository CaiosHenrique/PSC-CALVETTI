import javax.swing.JOptionPane;

public class Ex17 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));

        if (n1 > n2) {
            System.out.println("Numero 2: " + n2);
        }
        else {
            System.out.println("Numero 1: " + n1);
        }
        
    }
}