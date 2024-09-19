package Aula1;
import javax.swing.JOptionPane;

public class leitor_de_caracteres {

public static void main(String[] args) {

   JOptionPane.showMessageDialog(null, "Digite uma palavra letra por letra com maximo de 10 letras");
	String letra1 = JOptionPane.showInputDialog("primeira");
   String letra2 = JOptionPane.showInputDialog("segunda");
   String letra3 = JOptionPane.showInputDialog("terceira");
   String letra4 = JOptionPane.showInputDialog("quarta");
   String letra5 = JOptionPane.showInputDialog("quinta");
   String letra6 = JOptionPane.showInputDialog("sexta");
   String letra7 = JOptionPane.showInputDialog("setima");
   String letra8 = JOptionPane.showInputDialog("oitava");
   String letra9 = JOptionPane.showInputDialog("nona");
   String letra10 = JOptionPane.showInputDialog("decima");
   
		
   System.out.println(letra1 + letra2 + letra3 + letra4 + letra5 + letra6 + letra7 + letra8 + letra9 + letra10);
          
	}

}