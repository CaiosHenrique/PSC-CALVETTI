package Aula1;
import javax.swing.JOptionPane;

public class leitor_de_casas_decimais {
	public static void main(String[] args) {
   
      String milhar = JOptionPane.showInputDialog("Digite a unidade milhar");
      String centena = JOptionPane.showInputDialog("Digite unidade centena");
      String dezena = JOptionPane.showInputDialog("Digite a unidade dezena");
      String unidade = JOptionPane.showInputDialog("Digite a unidade");
      
      char cMilhar = milhar.charAt(0);
      char cCentena = centena.charAt(0);
      char cDezena = dezena.charAt(0);
      char cUnidade = unidade.charAt(0);
      
      System.out.println("O numero tem como unidade de milhar: " + cMilhar + " centena: " + cCentena + " dezena: " + cDezena + " unidade: " + cUnidade + "e o numero é: " + cMilhar + cCentena + cDezena + cUnidade);
      
	}
}