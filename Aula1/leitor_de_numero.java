package Aula1;
import javax.swing.JOptionPane;

public class leitor_de_numero {
	public static void main(String[] args) {
      int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
      System.out.println("o numero digitado eh: " + num);
  
	}
}