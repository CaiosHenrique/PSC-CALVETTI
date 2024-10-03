import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números pares a serem impressos:"));
        String resultado = "";

        for (int i = 1; i <= quantidade; i++) {
            resultado += 2 * i + " ";
        }

        JOptionPane.showMessageDialog(null, "Números pares: " + resultado);
    }
}
