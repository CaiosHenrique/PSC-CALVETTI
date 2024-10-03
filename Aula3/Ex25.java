
import javax.swing.JOptionPane;

public class Ex25 {

    public static void main(String[] args) {
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int totalVotos = 0;
        int voto;

        do {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato (1-4) ou -1 para encerrar:"));

            if (voto == 1) {
                votos1++;
                totalVotos++;
            } else 
            if (voto == 2) {
                votos2++;
                totalVotos++;
            } else 
            if (voto == 3) {
                votos3++;
                totalVotos++;
            } else 
            if (voto == 4) {
                votos4++;
                totalVotos++;
            } else 
            if (voto != -1) {
                System.out.println("Voto inválido.");
            }
        } while (voto != -1);

        if (totalVotos > 0) {
            double percentual1 = (votos1 / (double) totalVotos) * 100;
            double percentual2 = (votos2 / (double) totalVotos) * 100;
            double percentual3 = (votos3 / (double) totalVotos) * 100;
            double percentual4 = (votos4 / (double) totalVotos) * 100;

            String resultado = "Resultado da eleição:\n"
                    + "Candidato 1: " + percentual1 + "% dos votos\n"
                    + "Candidato 2: " + percentual2 + "% dos votos\n"
                    + "Candidato 3: " + percentual3 + "% dos votos\n"
                    + "Candidato 4: " + percentual4 + "% dos votos\n"
                    + "Total de eleitores: " + totalVotos;

            System.out.println(resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum voto registrado.");
        }
    }
}
