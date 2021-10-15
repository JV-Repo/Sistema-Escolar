package com.company;

public class Aluno {

    private String  nome;
    private float   nota;
    private int     idade;

    public Aluno(String nome,float nota, int idade) throws ArithmeticException {
        this.setNome(nome);
        if(nota < 0 || nota > 10) {
            throw new ArithmeticException(" Nota inválida!");
        }else{
            this.setNota(nota);
        }
        if(idade < 0){
            throw new ArithmeticException(" Idade Não Pode Ser Negativa!");
        }else{
            this.setIdade(idade);
        }
    }

    public void recuperar(Boolean foo){
        if(this.nota >= 7 && Boolean.TRUE.equals(foo)){
            this.setNota(7);
        }
    }

    public void imprimir(){
        System.out.print(
                "\n\n> Nome :  " + this.getNome() +
                "\n> Idade : " + this.getIdade() +
                "\n> Nota :  " + this.getNota()
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        if(nota < 0 || nota > 10 ) {
            throw new ArithmeticException(" Nota inválida!");
        }else{
            this.nota = nota;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new ArithmeticException(" Idade Não Pode Ser Negativa!");
        }else{
            this.idade = idade;
        }
    }
}
