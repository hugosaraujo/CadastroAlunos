package cadastroalunos.principal;

import cadastroalunos.estruturadedados.Pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha spiceGirls = new Pilha();
        spiceGirls.insere("emma");
        System.out.println(spiceGirls);
        spiceGirls.insere("mel c");
        System.out.println(spiceGirls);
        spiceGirls.insere("victoria");
        System.out.println(spiceGirls);
        spiceGirls.remove();
        System.out.println(spiceGirls);
        spiceGirls.insere("mel b");
        spiceGirls.insere("geri");
        System.out.println(spiceGirls.vazia());

        Pilha pilha = new Pilha();
        System.out.println(pilha.vazia());

    }
}
