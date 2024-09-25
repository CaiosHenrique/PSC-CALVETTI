import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-999 para sair):"));

            if (numero == -999) {
                break;
            }
            for (int divisores = 1; divisores <= numero; divisores++) {
                if (numero % divisores == 0) {
                    System.out.println(divisores);
                }
            }
        }
    }
}
