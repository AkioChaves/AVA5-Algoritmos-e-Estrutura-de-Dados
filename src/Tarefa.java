class Tarefa 
{
    private int MAX = 100;
    private int topo = -1;
    private int topoConcluidas = -1;
    private String[] tarefas = new String[MAX];
    private String[] tarefasConcluidas = new String[MAX];

    void adicionar(String tarefa) 
    {
        if (topo >= (MAX - 1)) 
        {
            System.out.println("Sua Agenda de tarefas está cheia.");
        }
        else 
        {
            tarefas[++topo] = tarefa;
            System.out.println("A tarefa '" + tarefa + "' foi adicionada a sua Agenda.");
        }
    }

    void remover()
    {
        if(topo < 0)
        {
            System.out.println("Não existe tarefa para ser removida.");
        }
        else
        {
            System.out.println("A tarefa '" + tarefas[topo] + "' foi removida.");
            tarefas[topo] = null;
            topo--;
        }
    }

    void concluir()
    {
        if(topo < 0)
        {
            System.out.println("Não existe tarefa para ser concluída.");
        }
        else
        {
            tarefasConcluidas[++topoConcluidas] = tarefas[topo];
            System.out.println("A tarefa '" + tarefas[topo] + "' foi concluída.");
            tarefas[topo] = null;
            topo--;
        }
    }

    void restaurar()
    {
        if(topoConcluidas < 0)
        {
            System.out.println("Não existe tarefas concluídas.");
        }
        else
        {
            tarefas[++topo] = tarefasConcluidas[topoConcluidas];
            System.out.println("A tarefa '" + tarefasConcluidas[topoConcluidas] + "' foi restaurada.");
            tarefasConcluidas[topoConcluidas] = null;
            topoConcluidas--;
        }
    }

    void consultar()
    {
        System.out.println("Você tem " + (topo + 1) + " tarefa(s).");
        System.out.println();

        for(int i = topo; i >= 0; i--)
        {
            System.out.println("Tarefa nº"+ (i + 1) + ": " + tarefas[i]) ;
        }
    }
}