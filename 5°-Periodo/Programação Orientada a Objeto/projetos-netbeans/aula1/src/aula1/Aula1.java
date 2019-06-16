package aula1;

import javax.swing.JOptionPane;

public class Aula1 {

    private String disciplina;
    private String conteudo;
    private String dataAula;
    private int horario;

    public static void main(String[] args) {
        aluno a1 = new aluno();
        Aula1 p2 = new Aula1();
        String n = JOptionPane.showInputDialog("Informe seu Nome");
        String t = JOptionPane.showInputDialog("Informe seu Telefone");
        String c = JOptionPane.showInputDialog("Informe seu Cpf");
        String co = JOptionPane.showInputDialog("Informe o conteúdo da aula");
        String dat = JOptionPane.showInputDialog("Data");
        String disc = JOptionPane.showInputDialog("Discipina");
        String hor = JOptionPane.showInputDialog("Horário");
        String per = JOptionPane.showInputDialog("Período");
        String cur = JOptionPane.showInputDialog("Curso");
        String mat = JOptionPane.showInputDialog("Matrícula");
        int h;
        h = Integer.parseInt(hor);
        p2.setConteudo(co);
        p2.setDataAula(dat);
        p2.setDisciplina(disc);
        p2.setHorario(h);

        a1.setNome(n);
        a1.setTelefone(t);
        a1.setCpf(c);
        a1.setMatricula(mat);
        a1.setCurso(cur);
        a1.setPeriodo(per);
        String M = "Nome: " + a1.getNome() + "\nCPF: " + a1.getCpf() + "\nTelefone: "
                + a1.getTelefone() + "\nCurso: " + a1.getCurso() + "\nPeríodo: "
                + a1.getPeriodo() + "\nMatrícula: " + a1.getMatricula();
        p2.mostra(M);
        M = "Aula: " + p2.getDataAula() + "\nConteúdo: " + p2.getConteudo()
                + "\nDisciplina: " + p2.getDisciplina() + "\nHorário: " + p2.getHorario();
        p2.mostra(M);

    }

    private void mostra(String shou) {
        JOptionPane.showMessageDialog(null, shou);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataAula() {
        return dataAula;
    }

    public void setDataAula(String dataAula) {
        this.dataAula = dataAula;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

}
