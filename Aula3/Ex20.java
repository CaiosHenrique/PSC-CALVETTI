import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args) {
        String limiteStr = JOptionPane.showInputDialog("Digite o limite superior do intervalo:");
        String incrementoStr = JOptionPane.showInputDialog("Digite o incremento:");

        int limite = Integer.parseInt(limiteStr);
        int incremento = Integer.parseInt(incrementoStr);

        String resultado = "Resultado:\n";
        for (int i = 0; i <= limite; i += incremento) {
            resultado += i + "\n";
        }

        System.out.println(resultado);
    }
}
