package com.company;

import java.util.ArrayList;

public class Turma {

    private String nome;
    private ArrayList<Aluno> alunos;

    public Turma(String nome){
        this.setNome(nome);
        alunos = new ArrayList<>();
        alunos.add(new Aluno("aluno1",7,19));
        alunos.add(new Aluno("aluno2",9,21));
        alunos.add(new Aluno("aluno3",8,19));
        alunos.add(new Aluno("aluno4",7,20));
        alunos.add(new Aluno("aluno5",4,18));
    }

    public void imprimirAlunosAprovados(){
        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                System.out.println("\nAprovado! : " + aluno.getNome());
            }
        }
    }

    public void imprimir(){
        for(Aluno aluno : alunos){
            aluno.imprimir();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
