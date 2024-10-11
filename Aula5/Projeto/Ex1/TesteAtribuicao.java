package Ex1;

import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        String nomeProfessor = JOptionPane.showInputDialog("Nome do professor");
        int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("idade do professor"));

        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina");
        String texto = JOptionPane.showInputDialog("Aula pratica?");
        boolean pratica;

        if (texto == "sim" || texto == "Sim") {
            pratica = true;
        } else {
            pratica = false;
        }

        Professor professor = new Professor(nomeProfessor, idadeProfessor);
        Disciplina disciplina = new Disciplina(nomeDisciplina, pratica);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        System.out.println(atribuicao.getDados());
    }
}
