import java.util.Scanner;

public class GerenciamentoDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[100]; 
        int qtdTarefas = 0;
        int opcao;

        do {
            System.out.println("--- Menu de Tarefas ---");
            System.out.println("1- Adicionar Tarefa");
            System.out.println("2- Listar Tarefas");
            System.out.println("3- Remover Tarefa");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (qtdTarefas < tarefas.length) {
                        System.out.print("Digite qual tarefa deseja adicionar: ");
                        String tarefa = scanner.nextLine();
                        tarefas[qtdTarefas] = tarefa;
                        qtdTarefas++;
                        System.out.println("Tarefa adicionada com sucesso!");
                    } else {
                        System.out.println("Lista de tarefas cheia!");
                    }
                    break;

                case 2:
                    if (qtdTarefas == 0) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\n--- Lista de Tarefas ---");
                        for (int i = 0; i < qtdTarefas; i++) {
                            System.out.println((i + 1) + " - " + tarefas[i]);
                        }
                    }
                    break;

                case 3:
                    if (qtdTarefas == 0) {
                        System.out.println("Nenhuma tarefa para remover.");
                    } else {
                        System.out.print("Digite o número da tarefa que deseja remover: ");
                        int numeroRemover = scanner.nextInt();
                        scanner.nextLine(); // limpar o buffer

                        if (numeroRemover >= 1 && numeroRemover <= qtdTarefas) {
                            // remover deslocando os elementos
                            for (int i = numeroRemover - 1; i < qtdTarefas - 1; i++) {
                                tarefas[i] = tarefas[i + 1];
                            }
                            qtdTarefas--;
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema! Aguarde...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
