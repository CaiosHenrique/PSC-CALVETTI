package Projeto.Ex3;

import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String professor = JOptionPane.showInputDialog("Digite o professor");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre"));

        Disciplina disciplina = new Disciplina(nome, professor, semestre, false);

        System.out.println(disciplina.getNome() + "\n" + disciplina.getProfessor() + "\n" + disciplina.getSemestre());

    }
}
