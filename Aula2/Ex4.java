import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o terceiro numero"));
        

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println(num1 + num2 + num3);

        }
        else { 
            if (num2 > num1 && num2 > num3 && num3 > num1) {
                System.out.println(num2 + num3 + num1);
            }
            else
            {
                if (num3 > num1 && num3 > num2 && num2 > num1) {
                    System.out.println(num3 + num2 + num1);
                }
                else
                {
                    if (num3 > num1 && num3 > num2 && num1 > num2) {
                        System.out.println(num3 + num1 + num2);
                    }
                    else
                    {
                        if (num2 > num1 && num2 > num3 && num1 > num3) {
                            System.out.println(num2 + num1 + num3);
                        }
                        else
                        {
                            System.out.println(num1 + num3 + num2); 
                        }
                    }
                }
            }
        }
    }
}
