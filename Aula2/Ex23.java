import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int maior;
        int intermediario;
        int menor;
        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                intermediario = num2;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                intermediario = num1;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                intermediario = num1;
                menor = num2;
            } else {
                intermediario = num2;
                menor = num1;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O número intermediário é: " + intermediario);
        System.out.println("O menor número é: " + menor);
    }
}

