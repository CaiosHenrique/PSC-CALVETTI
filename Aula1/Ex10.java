package Aula1;
import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");

        int meio1 = frase1.length() / 2;
        int meio2 = frase2.length() / 2;
        int meio3 = frase3.length() / 2;

        String primeiraMetade1 = frase1.substring(0, meio1);
        String segundaMetade1 = frase1.substring(meio1);

        String primeiraMetade2 = frase2.substring(0, meio2);
        String segundaMetade2 = frase2.substring(meio2);

        String primeiraMetade3 = frase3.substring(0, meio3);
        String segundaMetade3 = frase3.substring(meio3);

        String fraseEmbaralhada = primeiraMetade2 + segundaMetade3 + segundaMetade2 + primeiraMetade1 + primeiraMetade3 + segundaMetade1;
        String frasesConcatenadas = frase1 + frase2 + frase3;

        JOptionPane.showMessageDialog(null, "Frases concatenadas: " + frasesConcatenadas + "\nFrase embaralhada: " + fraseEmbaralhada);
    }
}
