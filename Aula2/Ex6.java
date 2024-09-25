import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva o primeiro numero"));

        if (num1 == 20 ) {
            System.out.println("Numero igual a 20!: " + num1);
            
        }
        else { 
            if (num1 < 20) {
                System.out.println("Numero menor que 20!: " + num1);
                
            }
            else
            {
                System.out.println("Numero maior que 20!: " + num1);
            }
        }
    }
}
