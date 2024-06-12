import java.util.Scanner;

public class Menu 
{
    public static void exibirAgenda(Scanner scanner, Tarefa tarefa) 
    {
        while(true) 
        {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Consultar Tarefas");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Concluir Tarefa");
            System.out.println("5. Restaurar Tarefa");
            System.out.println("6. Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            String escolha = scanner.nextLine();
            System.out.println();

            switch(escolha)
            {
                case "1":
                    tarefa.consultar();
                    break;
                case "2":
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String novaTarefa = scanner.nextLine();
                    tarefa.adicionar(novaTarefa);
                    break;
                case "3":
                    tarefa.remover();
                    break;
                case "4":
                    tarefa.concluir();
                    break;
                case "5":
                    tarefa.restaurar();
                    break;
                case "6":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
            System.out.println("Pressione Enter para continuar.");
            scanner.nextLine();
            
            limparTela();
        }
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
