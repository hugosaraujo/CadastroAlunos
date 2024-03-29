package cadastroalunos.principal;

import cadastroalunos.estruturadedados.Vetor;
import cadastroalunos.modelos.Aluno;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Doug Funnie");
        Aluno a2 = new Aluno("Rashad Vaughn");
        Aluno ad = new Aluno("Anthony Davis");
        Aluno a3 = new Aluno("Hermione Granger");
        Aluno a4 = new Aluno("Mérope Gaunt");

        Vetor listaDeAlunos = new Vetor();
        listaDeAlunos.adiciona(a1);
        System.out.println(listaDeAlunos.tamanho());
        listaDeAlunos.adiciona(a2);
        System.out.println(listaDeAlunos.tamanho());
        listaDeAlunos.adiciona(ad);
        System.out.println(listaDeAlunos.tamanho());
        listaDeAlunos.adiciona(a3);
        System.out.println(listaDeAlunos.tamanho());

        System.out.println(listaDeAlunos);
        System.out.println(listaDeAlunos.contem(a1));
        System.out.println(listaDeAlunos.contem(a4));
        System.out.println(listaDeAlunos.pega(2));
        listaDeAlunos.adiciona(2, a4);
        System.out.println(listaDeAlunos);
        listaDeAlunos.remove(2);
        System.out.println(listaDeAlunos);
    }
}
