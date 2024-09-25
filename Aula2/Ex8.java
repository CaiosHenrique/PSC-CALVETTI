import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

        if (num1 > num2) {
            System.out.println(num1+ "e" + num2);
            
        }
        else { 
            System.out.println(num2 + "e" + num1);
        }
    }
}
