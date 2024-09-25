import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    

        if (num1 % 5 == 0) {
            System.out.println("É multiplo de 5! " + num1);
            
        }
        else { 
            System.out.println("Não é multiplo de 5.");

        }
    }
}
