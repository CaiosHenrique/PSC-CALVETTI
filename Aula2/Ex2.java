import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo numero"));

        if (num1 + num2 <= 20) {
            int resultado = num1 + num2;
            System.out.println(resultado - 5);
        }
        else { 
            System.out.println("numero maior que 20");
        }
    }
}
