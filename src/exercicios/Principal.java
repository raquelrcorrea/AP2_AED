package exercicios;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        System.out.println("LISTA");
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.mostrar();

        System.out.println("\nPILHA");
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.mostrar();
        pilha.desempilhar();
        pilha.mostrar();

        System.out.println("\nFILA");
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.mostrar();
        fila.desenfileirar();
        fila.mostrar();
    }
}
