package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {
        ArrayList<Turma> turmas = new ArrayList<>();
        turmas.add(new Turma("Turma1"));
        turmas.add(new Turma("Turma2"));
        turmas.add(new Turma("Turma3"));

        Scanner scan = new Scanner(System.in);

        String alu;

        for(int i=0; i<turmas.size(); i++) {
            System.out.print("\n\n ----Alunos na Turma" + (i + 1) + " :");
            turmas.get(i).imprimir();

            System.out.print("\n\n ----Alunos Aprovados na Turma" + (i + 1) + " :");
            turmas.get(i).imprimirAlunosAprovados();

            System.out.println(
                    "\n Para Recuperar Algum Aluno digite o número do aluno: \n" +
                    " (Deixe em branco para nenhum)\n"
            );

            alu = null;
            alu = scan.nextLine();
            if(alu == null || alu.equals(" ") || alu.equals("")){continue;}

            try {
                int y = Integer.parseInt(alu);
                y--;
                turmas.get(i).getAlunos().get(y).recuperar(true);
                System.out.println("Aluno" + (y + 1) + " Recuperado!");
            }catch(IndexOutOfBoundsException ex){
                System.out.println(" Aluno Não Existente!");
            }
        }
    }
}
