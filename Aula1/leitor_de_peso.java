package Aula1;
import javax.swing.JOptionPane;

public class leitor_de_peso {

public static void main(String[] args) {


	int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso de forma inteira"));
   		
   System.out.println("O peso informado foi " + peso + "kg");
       
	}

}