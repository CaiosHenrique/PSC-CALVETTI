import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String curso = JOptionPane.showInputDialog("Digite o seu curso");
        int quantAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
        
        Turma turma = new Turma(nome, curso, quantAlunos, serie);

        System.out.println(turma.getNome() + "\n" + turma.getCurso() + "\n" + turma.getQuantAlunos() + "\n" + turma.getSerie());
    }
}
