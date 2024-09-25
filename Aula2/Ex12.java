import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    
        if (num1 % 2 == 0 && num1 % 10 == 0) {
            System.out.println("É divisivel por 10! " + num1);
            
        }
        else { 
            if (num1 % 5 == 0) {
                System.out.println("É divisivel por 5! " + num1);
            }
            else
            {
                if (num1 % 2 == 0) {
                    System.out.println("É divisivel por 2! " + num1);
                }
                else
                {
                    System.out.println("Não É divisivel." + num1);
                }
            }
            
        }
    }
}
