package Aula1;
import javax.swing.JOptionPane;

public class leitor_de_data {
public static void main(String[] args) {
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia"));
      int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes"));
      int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
         
      System.out.println(dia + "/" + mes + "/" + ano);
       
	}
}