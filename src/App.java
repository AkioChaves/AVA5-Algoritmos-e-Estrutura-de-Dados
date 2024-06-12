import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();

        System.out.println("Bem vindo a sua Agenda!");

        Menu.exibirAgenda(scanner, tarefa);

        scanner.close();
    }
}
