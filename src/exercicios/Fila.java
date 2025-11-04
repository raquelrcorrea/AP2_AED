package exercicios;
public class Fila {
    private int[] elementos = new int[5];
    private int fim = 0;
    public void enfileirar(int valor) {
        if (fim < elementos.length) {
            elementos[fim] = valor;
            fim++;
            System.out.println("Valor " + valor + " enfileirado!");
        } else {
            System.out.println("A fila está cheia!");
        }
    }
    public void desenfileirar() {
        if (fim > 0) {
            int valorRemovido = elementos[0];
            for (int i = 0; i < fim - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            fim--;
            System.out.println("Valor " + valorRemovido + " desenfileirado!");
        } else {
            System.out.println("A fila está vazia!");
        }
    }
    public void mostrar() {
        if (fim == 0) {
            System.out.println("Fila vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = 0; i < fim; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}