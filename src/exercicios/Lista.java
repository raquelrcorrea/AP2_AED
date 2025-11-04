package exercicios;
public class Lista {
    private int[] elementos = new int[5];
    private int tamanho = 0;
    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
            System.out.println("Valor " + valor + " inserido!");
        } else {
            System.out.println("A lista está cheia!");
        }
    }
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
        } else {
            System.out.print("Lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}