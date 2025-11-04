package exercicios;
public class Pilha {
    private int[] elementos = new int[5];
    private int topo = 0;
    public void empilhar(int valor) {
        if (topo < elementos.length) {
            elementos[topo] = valor;
            topo++;
            System.out.println("Valor " + valor + " empilhado!");
        } else {
            System.out.println("A pilha está cheia!");
        }
    }
    public void desempilhar() {
        if (topo > 0) {
            topo--;
            System.out.println("Valor " + elementos[topo] + " desempilhado!");
        } else {
            System.out.println("A pilha está vazia!");
        }
    }
    public void mostrar() {
        if (topo == 0) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha: ");
            for (int i = topo - 1; i >= 0; i--) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}