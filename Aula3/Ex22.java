import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String[] args) {
        
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior do intervalo:"));

        String resultado = "Resultado: ";
        for (int i = 1; i < limite; i += 2) {
            resultado += i + " ";
        }

        System.out.println(resultado);
    }
}
