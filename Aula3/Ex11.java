import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        int codigo;
        int tipo;
        int countResidencial = 0;
        int countComercial = 0;
        double kWh;
        double custo;
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        
        while (true) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair):"));
            if (codigo == 0){
                break;
            }
            kWh = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial):"));

            switch (tipo) {
                case 1:
                    custo = kWh * 0.3;
                    totalResidencial += kWh;
                    countResidencial++;
                    break;
                case 2:
                    custo = kWh * 0.5;
                    totalComercial += kWh;
                    countComercial++;
                    break;
                case 3:
                    custo = kWh * 0.7;
                    totalIndustrial += kWh;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de consumidor inválido!");
                    continue;
            }

            JOptionPane.showMessageDialog(null, "Código: " + codigo + "\nCusto: R$ " + custo);
        }

        double mediaResidencial = countResidencial > 0 ? totalResidencial / countResidencial : 0;
        double mediaComercial = countComercial > 0 ? totalComercial / countComercial : 0;

        System.out.println("Total de kWh residencial: " + totalResidencial);
        System.out.println("Total de kWh comercial: " + totalComercial);
        System.out.println("Total de kWh industrial: " + totalIndustrial);
        System.out.println("Média de consumo residencial: " + mediaResidencial);
        System.out.println("Média de consumo comercial: " + mediaComercial);
        System.out.println("----------------------");
    }
}
