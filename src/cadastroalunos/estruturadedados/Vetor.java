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

    public int tamanho(){
        return totalDeAlunos;
    }

    public Aluno pega(int posicao){
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posicao inválida");
        }
        return alunos[posicao];
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public void remove(){

    }

    public boolean devolve(){
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
