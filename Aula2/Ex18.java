import javax.swing.JOptionPane;

public class Ex18 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));

        if (n1 > n2) {
            System.out.println(n1 + " " + n2);
        }
        else {
            System.out.println(n2 + " " + n1);
        }
        
    }
}