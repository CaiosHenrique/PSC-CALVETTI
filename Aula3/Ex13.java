
import javax.swing.JOptionPane;

public class Ex13 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        boolean isPrimo = true;

        if (numero <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
        }
    }
}
