package exercicios;

// Implementação simples de Pilha (LIFO) usando vetor de tamanho 5
public class Pilha {

    // Vetor que armazena os elementos da pilha
    private int[] elementos = new int[5];

    // 'topo' representa quantos elementos existem e também a próxima posição livre.
    // topo == 0 -> pilha vazia; topo == elementos.length -> pilha cheia
    private int topo = 0;

    // Empilha (push): adiciona um elemento no topo da pilha
    public void empilhar(int valor) {
        // Checa se há espaço (topo < capacidade)
        if (topo < elementos.length) {
            // Coloca o valor na posição do topo (próxima livre)
            elementos[topo] = valor;
            // Incrementa topo para refletir o novo número de elementos
            topo++;
            System.out.println("Valor " + valor + " empilhado!");
        } else {
            // Se não houver espaço, mostra mensagem de pilha cheia
            System.out.println("A pilha está cheia! Não é possível empilhar mais elementos.");
        }
    }

    // Desempilha (pop): remove e retorna o elemento do topo
    // Aqui apenas imprime o valor removido; poderia retornar o int para reuso.
    public void desempilhar() {
        // Verifica se há elementos para remover (topo > 0)
        if (topo > 0) {
            // Decrementa topo para "remover" o elemento lógico
            topo--;
            // Recupera o valor que estava nessa posição (antigo topo)
            int valorRemovido = elementos[topo];
            // Opcional: poderia limpar elementos[topo] = 0; para legibilidade
            System.out.println("Valor " + valorRemovido + " desempilhado!");
        } else {
            // Pilha vazia: nada para desempilhar
            System.out.println("A pilha está vazia! Não é possível desempilhar.");
        }
    }

    // Mostrar o estado atual da pilha (do topo para a base)
    public void mostrar() {
        System.out.print("Estado atual da Pilha: ");
        // Se topo == 0, pilha vazia
        if (topo == 0) {
            System.out.println("(vazia)");
            return;
        }
        // Percorre de topo-1 até 0 para mostrar do topo para a base
        for (int i = topo - 1; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

