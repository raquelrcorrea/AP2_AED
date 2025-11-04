package exercicios;

// Implementação simples de Fila (FIFO) usando vetor circular com capacidade 5
public class Fila {

    // Vetor que armazena os elementos da fila
    private int[] elementos = new int[5];

    // Índice da posição do primeiro elemento (frente da fila)
    private int inicio = 0;

    // Índice da próxima posição livre onde um novo elemento será colocado (fim da fila)
    private int fim = 0;

    // Quantidade atual de elementos na fila
    private int tamanho = 0;

    // Enfileirar: adiciona elemento no fim da fila
    public void enfileirar(int valor) {
        // Se ainda há espaço (tamanho < capacidade)
        if (tamanho < elementos.length) {
            // Armazena o valor na posição 'fim'
            elementos[fim] = valor;
            // Avança 'fim' de forma circular: (fim + 1) % capacidade
            fim = (fim + 1) % elementos.length;
            // Incrementa contador de elementos
            tamanho++;
            System.out.println("Valor " + valor + " enfileirado!");
        } else {
            // Fila cheia
            System.out.println("A fila está cheia! Não é possível enfileirar mais elementos.");
        }
    }

    // Desenfileirar: remove elemento da frente da fila
    public void desenfileirar() {
        // Só pode remover se houver elementos
        if (tamanho > 0) {
            // Recupera o valor na posição 'inicio'
            int valorRemovido = elementos[inicio];
            // Avança 'inicio' de forma circular
            inicio = (inicio + 1) % elementos.length;
            // Decrementa o tamanho
            tamanho--;
            System.out.println("Valor " + valorRemovido + " desenfileirado!");
        } else {
            // Fila vazia
            System.out.println("A fila está vazia! Não é possível desenfileirar.");
        }
    }

    // Mostrar o estado atual da fila (da frente ao fim)
    public void mostrar() {
        System.out.print("Estado atual da Fila: ");
        // Se vazia, imprimir (vazia)
        if (tamanho == 0) {
            System.out.println("(vazia)");
            return;
        }
        // Começa em 'inicio' e percorre 'tamanho' elementos, avançando circularmente
        int pos = inicio;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[pos] + " ");
            pos = (pos + 1) % elementos.length;
        }
        System.out.println();
    }
}

