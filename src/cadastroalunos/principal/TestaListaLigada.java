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
        System.out.println();
    }
}
