package Aula1;
import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        String dataStr = JOptionPane.showInputDialog("Digite a data no formato ddmmaa:");
        int data = Integer.parseInt(dataStr);

        int dia = data / 10000;
        int mes = (data / 100) % 100;
        int ano = data % 100;

        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
