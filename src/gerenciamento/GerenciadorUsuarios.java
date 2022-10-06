package src.gerenciamento;

import java.util.ArrayList;

import src.usuario.*;

public class GerenciadorUsuarios {
    private ArrayList<Aluno> alunos;
    private ArrayList<Pesquisador> pesquisadores;
    private ArrayList<Professor> professores;
    private ArrayList<Profissional> profissionais;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Usuario> usuarios;

    public Aluno createAluno(String nome, String tipoGraduacao, int cpf, String senha) {
        if(alunos == null) {
            alunos = new ArrayList<Aluno>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }
        Aluno novoAluno = new Aluno(nome, tipoGraduacao, cpf, senha);
        usuarios.add(novoAluno);
        alunos.add(novoAluno);
        int indexOfAluno = alunos.lastIndexOf(novoAluno);
        return alunos.get(indexOfAluno);
    }
    public Pesquisador createPesquisador(String nome, String tipoGraduacao, int cpf, String senha) {
        if(pesquisadores == null) {
            pesquisadores = new ArrayList<Pesquisador>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }
        Pesquisador novoPesquisador = new Pesquisador(nome, tipoGraduacao, cpf, senha);
        usuarios.add(novoPesquisador);
        pesquisadores.add(novoPesquisador);
        int indexOfPesquisador = pesquisadores.lastIndexOf(novoPesquisador);
        return pesquisadores.get(indexOfPesquisador);
    }
    public Professor createProfessor(String nome, String tipoGraduacao, int cpf, String senha) {
        if(professores == null) {
            professores = new ArrayList<Professor>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }
        Professor novoProfessor = new Professor(nome, tipoGraduacao, cpf, senha);
        usuarios.add(novoProfessor);
        professores.add(novoProfessor);
        int indexOfProfessor = professores.lastIndexOf(novoProfessor);
        return professores.get(indexOfProfessor);
    }
    public Profissional createProfissional(String nome, String tipoGraduacao, int cpf, String senha) {
        if(profissionais == null) {
            profissionais = new ArrayList<Profissional>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }
        Profissional novoProfissional = new Profissional(nome, tipoGraduacao, cpf, senha);
        usuarios.add(novoProfissional);
        profissionais.add(novoProfissional);
        int indexOfProfissional = profissionais.lastIndexOf(novoProfissional);
        return profissionais.get(indexOfProfissional);
    }
    public Tecnico createTecnico(String nome, String tipoGraduacao, int cpf, String senha) {
        if(tecnicos == null) {
            tecnicos = new ArrayList<Tecnico>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }
        Tecnico novoTecnico = new Tecnico(nome, tipoGraduacao, cpf, senha);
        usuarios.add(novoTecnico);
        tecnicos.add(novoTecnico);
        int indexOfTecnico = tecnicos.lastIndexOf(novoTecnico);
        return tecnicos.get(indexOfTecnico);
    }
    public void listUsuarios(){
        for (Usuario elem: usuarios){
            System.out.println(elem);
        }
    }
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
}
