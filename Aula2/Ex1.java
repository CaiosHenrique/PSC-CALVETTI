import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {

       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro numero"));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo numero"));

       if (num1 + num2 > 10) {
        System.out.println(num1 + num2);
       }
       else { 
        System.out.println("numero menor que 10");
       }



    }
}