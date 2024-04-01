package cadastroalunos.principal;

import cadastroalunos.estruturadedados.ListaLigada;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("hermione");
        System.out.println(lista);
        lista.adicionaNoComeco("luna");
        lista.adiciona("tom");
        System.out.println(lista);
        lista.adiciona(2, "alanis");
        System.out.println(lista);

        Object x = lista.pega(3);
        System.out.println(x);
        System.out.println(lista.tamanho());


    }
}
