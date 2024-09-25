import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    

        if (num1 % 3 == 0 && num1 % 7 == 0) {
            System.out.println("É divisivel por 3 e por 7! " + num1);
            
        }
        else { 
            System.out.println("Não é divisivel por 3 e por 7.");

        }
    }
}
