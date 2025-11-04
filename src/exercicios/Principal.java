package exercicios;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int opc;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Lista");
            System.out.println("2 - Pilha");
            System.out.println("3 - Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> menuLista(sc, lista);
                case 2 -> menuPilha(sc, pilha);
                case 3 -> menuFila(sc, fila);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opc != 0);
    }
    private static void menuLista(Scanner sc, Lista lista) {
        int op;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostrar");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Valor: ");
                    lista.inserir(sc.nextInt());
                }
                case 2 -> lista.mostrar();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
    private static void menuPilha(Scanner sc, Pilha pilha) {
        int op;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Mostrar");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Valor: ");
                    pilha.empilhar(sc.nextInt());
                }
                case 2 -> pilha.desempilhar();
                case 3 -> pilha.mostrar();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
    private static void menuFila(Scanner sc, Fila fila) {
        int op;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Enfileirar");
            System.out.println("2 - Desenfileirar");
            System.out.println("3 - Mostrar");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Valor: ");
                    fila.enfileirar(sc.nextInt());
                }
                case 2 -> fila.desenfileirar();
                case 3 -> fila.mostrar();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}