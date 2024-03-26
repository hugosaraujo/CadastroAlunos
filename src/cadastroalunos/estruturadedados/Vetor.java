package cadastroalunos.estruturadedados;

import cadastroalunos.modelos.Aluno;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos;

    public void adiciona(Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void pega(int posicao){
        //vai ser um int, modificado para não dar erro;
    }

    public void remove(){

    }

    public boolean devolve(){
        return false;
    }

    public int tamanho(){
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
