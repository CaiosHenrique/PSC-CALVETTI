import javax.swing.JOptionPane;

public class Ex26 {
    public static void main(String[] args) {
        while (true) {
            String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            String entrada2 = JOptionPane.showInputDialog("Digite o segundo número:");

            double numero1 = Double.parseDouble(entrada1);
            double numero2 = Double.parseDouble(entrada2);

            String menu = "Operações Disponíveis:\n" +
                          "1. Adição\n" +
                          "2. Subtração\n" +
                          "3. Multiplicação\n" +
                          "4. Divisão\n" +
                          "9. Sair do Programa\n" +
                          "Digite o número de ordem da opção desejada:";
            String opcao = JOptionPane.showInputDialog(menu);

            int escolha = Integer.parseInt(opcao);

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("Resultado: " + (numero1 / numero2));
                    } else {
                        System.out.println("Divisão por zero. Impossível calcular.");
                    }
                    break;
                case 9:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
