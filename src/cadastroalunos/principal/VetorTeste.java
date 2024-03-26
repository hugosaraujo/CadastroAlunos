package cadastroalunos.principal;

import cadastroalunos.estruturadedados.Vetor;
import cadastroalunos.modelos.Aluno;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Doug Funnie");
        Aluno a2 = new Aluno("Rashad Vaughn");

        Vetor listaDeAlunos = new Vetor();
        listaDeAlunos.adiciona(a1);
        listaDeAlunos.adiciona(a2);

        System.out.println(listaDeAlunos.toString());
    }
}
