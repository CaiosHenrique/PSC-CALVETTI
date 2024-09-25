import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    

        if (num1 % 3 == 0) {
            System.out.println("É dividido por 3! " + num1);
            
        }
        else { 
            System.out.println("Não é dividido por 3");

        }
    }
}
