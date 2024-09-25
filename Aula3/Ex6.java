import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        while (true) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (-999 para sair):"));

            if (numero == -999) {
                break;
            }
            double raizQuadrada = Math.sqrt(numero);
            double inverso = 1 / numero;

            System.out.println("Número: " + numero);
            System.out.println("Raiz quadrada: " + raizQuadrada);
            System.out.println("Inverso: " + inverso);
            System.out.println("----------------------");
        }
    }
}
