package exercicios;

// Classe que implementa uma lista simples baseada em vetor com capacidade fixa (5)
public class Lista {

    // Cria um vetor de inteiros com capacidade para 5 elementos.
    // Cada posição do vetor pode armazenar um valor inteiro.
    private int[] elementos = new int[5];

    // Guarda quantos elementos foram efetivamente inseridos na lista.
    // Inicialmente é 0 (lista vazia).
    private int tamanho = 0;

    // Método público para inserir um valor na lista.
    // Se houver espaço, adiciona o valor ao final (índice 'tamanho') e incrementa 'tamanho'.
    public void inserir(int valor) {
        // Verifica se ainda há espaço no vetor (tamanho < capacidade)
        if (tamanho < elementos.length) {
            // Armazena o valor na próxima posição livre
            elementos[tamanho] = valor;
            // Atualiza o contador de elementos
            tamanho++;
            // Mensagem para o usuário (opcional)
            System.out.println("Valor " + valor + " inserido com sucesso!");
        } else {
            // Caso não haja espaço, informa que a lista está cheia
            System.out.println("A lista está cheia! Não é possível inserir mais elementos.");
        }
    }

    // Método para exibir o estado atual da lista.
    // Imprime todos os elementos desde o índice 0 até tamanho-1.
    public void mostrar() {
        System.out.print("Estado atual da Lista: ");
        // Se não há elementos, imprime "(vazia)"
        if (tamanho == 0) {
            System.out.println("(vazia)");
            return;
        }
        // Percorre somente as posições que foram preenchidas (0 .. tamanho-1)
        for (int i = 0; i < tamanho; i++) {
            // Imprime o elemento na posição i seguido de um espaço
            System.out.print(elementos[i] + " ");
        }
        // Pula linha no final
        System.out.println();
    }
}
