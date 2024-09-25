import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro numero"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Quarto numero"));
        int n5 = Integer.parseInt(JOptionPane.showInputDialog("Quinto numero"));

        int maior = n1;
        int menor = n1;

        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;
        if (n4 > maior) maior = n4;
        if (n5 > maior) maior = n5;

        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        if (n5 < menor) menor = n5;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        
    }
}