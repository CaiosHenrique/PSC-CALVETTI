import javax.swing.JOptionPane;

public class Ex18 {
    public static void main(String[] args) {
        
        int limiteInferior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior em graus Celsius:"));
        int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior em graus Celsius:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));

        String tabela = "Celsius\tFahrenheit\n";

        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            tabela += celsius + "\t" + String.format("%.2f", fahrenheit) + "\n";
        }

        System.out.println(tabela);
    }
}
