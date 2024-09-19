package Aula1;
import javax.swing.JOptionPane;

public class leitor_de_nome {

	public static void main(String[] args) {
   
   String nome1 = JOptionPane.showInputDialog("Nome");
   String nome2 = JOptionPane.showInputDialog("Digite o segundo nome");
   String nome3 = JOptionPane.showInputDialog("Digite o terceiro nome");
		
   System.out.println(nome3 + " " + nome2 + " " + nome1);
      
	}

}