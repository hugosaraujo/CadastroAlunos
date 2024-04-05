package cadastroalunos.principal;

import cadastroalunos.estruturadedados.Fila;

public class TestaFila {
    public static void main(String[] args) {

        Fila fila = new Fila();
        System.out.println(fila.vazia());
        fila.adiciona("Gica");
        fila.adiciona("Guilherme");
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
        System.out.println(fila.vazia());
    }
}
