public class Sistema {

    private static void exibirMenu() {

        System.out.println("---------------");
        System.out.println("|     BOATE    |");
        System.out.println("---------------");
        System.out.println("\nClientes");
        System.out.println("[1] Cadastrar Cliente");
        System.out.println("[2] Procurar Cliente");
        System.out.println("[3] Excluir Cliente");
        System.out.println("[4] Listar Todos os Clientes");
        System.out.println("\nFuncionarios:");
        System.out.println("[5] Cadastrar Funcionario");
        System.out.println("[6] Procurar Funcionario");
        System.out.println("[7] Excluir Funcionario");
        System.out.println("[8] Listar Todos os Funcionarios");

        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void verificarOpcao(int op) {

        String nome;
        int cpf;
        int telefone;        

        switch (op) {
            case 1:

                System.out.println("\nNovo Programador:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Linguagens que domina:");
                linguagens = Console.lerString();

                Programador p = new Programador(matricula, nome, linguagens);

                Cadastro.cadastrar(p);

                System.out.println("\nProgramador cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Gerente:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Projeto que gerencia:");
                nomeProjeto = Console.lerString();

                Gerente g = new Gerente(matricula, nome, nomeProjeto);

                Cadastro.cadastrar(g);

                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nProcurar Funciomário:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                // enviar a matricula digitada como parametro para o
                // metodo buscar da classe Cadastro.
                // Este método retornará ou um objeto do tipo Funcinario,
                // ou null, se não encontrar funcionario com a mesma matricula informada
                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {

                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                    return;

                }

                System.out.println("\nFuncionário " + matricula + " não foi encontrado");

                break;

            case 4:

                System.out.println("\nTodos os funcionários Cadastrados:");

                // Se o tamanho da lista for igual a 0 (zero)
                if (Cadastro.getListaFuncionarios().size() == 0) {

                    System.out.println("\nNão há fucionários cadastrados...");
                    return; // finaliza o método

                }

                // caso contrário, percorre a lista e msotra os funcionarios um a um
                for (Funcionario temp : Cadastro.getListaFuncionarios()) {

                    System.out.println(temp.toString());

                }

                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
