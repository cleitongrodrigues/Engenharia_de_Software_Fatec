import java.util.ArrayList;
import java.util.Scanner;
 
public class GerenciamentoDeTarefas {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao;
 
        do {
            System.out.println("\n--- Menu de Gerenciamento de Tarefas ---");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
           
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next(); // descarta entrada inválida
            }
           
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir o \n
 
            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner, tarefas);
                    break;
                case 2:
                    listarTarefas(tarefas);
                    break;
                case 3:
                    removerTarefa(scanner, tarefas);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
 
        } while (opcao != 4);
 
        scanner.close();
    }
 
    public static void adicionarTarefa(Scanner scanner, ArrayList<String> tarefas) {
        System.out.print("Digite o nome da tarefa: ");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }
 
    public static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
 
    public static void removerTarefa(Scanner scanner, ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia. Nada para remover.");
            return;
        }
 
        listarTarefas(tarefas);
        System.out.print("Digite o número da tarefa a ser removida: ");
 
        if (scanner.hasNextInt()) {
            int indice = scanner.nextInt();
            scanner.nextLine(); // consumir o \n
            if (indice >= 1 && indice <= tarefas.size()) {
                tarefas.remove(indice - 1);
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.println("Entrada inválida.");
            scanner.nextLine(); // consumir entrada inválida
        }
    }
}