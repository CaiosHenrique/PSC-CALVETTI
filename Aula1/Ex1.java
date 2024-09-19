package Aula1;
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));

        int diasVividos = idade * 365;

        System.out.println("Você viveu aproximadamente " + diasVividos + " dias.");


    }
}