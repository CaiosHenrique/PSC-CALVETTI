package Aula1;
import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Entre com uma data no formato dd/mm/aa:");
        
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 8);

        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
