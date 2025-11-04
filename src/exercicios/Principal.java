package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe Principal com menu interativo para testar Lista, Pilha e Fila.
 * Coloque este arquivo no mesmo pacote das classes Lista, Pilha e Fila.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner para ler entradas do usuário
        Lista lista = new Lista();                  // Instância da Lista
        Pilha pilha = new Pilha();                  // Instância da Pilha
        Fila fila = new Fila();                     // Instância da Fila

        boolean sair = false;
        while (!sair) {                             // Loop do menu principal
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Testar Lista");
            System.out.println("2 - Testar Pilha");
            System.out.println("3 - Testar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opc = readInt(sc);
            switch (opc) {
                case 1:
                    menuLista(sc, lista);
                    break;
                case 2:
                    menuPilha(sc, pilha);
                    break;
                case 3:
                    menuFila(sc, fila);
                    break;
                case 0:
                    sair = true;
                    System.out.println("Saindo. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }

    // ---------- MENU LISTA ----------
    private static void menuLista(Scanner sc, Lista lista) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1 - Inserir (inserir(int valor))");
            System.out.println("2 - Mostrar (mostrar())");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");

            int opc = readInt(sc);
            switch (opc) {
                case 1:
                    System.out.print("Valor a inserir: ");
                    int v = readInt(sc);
                    lista.inserir(v);
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // ---------- MENU PILHA ----------
    private static void menuPilha(Scanner sc, Pilha pilha) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar (empilhar(int valor))");
            System.out.println("2 - Desempilhar (desempilhar())");
            System.out.println("3 - Mostrar (mostrar())");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");

            int opc = readInt(sc);
            switch (opc) {
                case 1:
                    System.out.print("Valor a empilhar: ");
                    int v = readInt(sc);
                    pilha.empilhar(v);
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // ---------- MENU FILA ----------
    private static void menuFila(Scanner sc, Fila fila) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Enfileirar (enfileirar(int valor))");
            System.out.println("2 - Desenfileirar (desenfileirar())");
            System.out.println("3 - Mostrar (mostrar())");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");

            int opc = readInt(sc);
            switch (opc) {
                case 1:
                    System.out.print("Valor a enfileirar: ");
                    int v = readInt(sc);
                    fila.enfileirar(v);
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.mostrar();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // ---------- LEITURA SEGURO DE INTEIRO ----------
    // Lê um inteiro do Scanner tratando InputMismatchException.
    private static int readInt(Scanner sc) {
        while (true) {
            try {
                int n = sc.nextInt();
                sc.nextLine(); // consome a quebra de linha pendente
                return n;
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                sc.nextLine(); // descarta o token inválido
            }
        }
    }
}
