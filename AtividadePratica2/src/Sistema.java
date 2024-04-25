import java.util.Scanner;

public class Sistema {
    private static Scanner scanner = new Scanner(System.in);
    
    private static void exibirMenu() {
        System.out.println("\n");
        System.out.println("─────▄▀──                         ─────▄▀──");
        System.out.println("─█▀▀▀█▀█─     ---------------     ─█▀▀▀█▀█─");
        System.out.println("──▀▄░▄▀──     |     BOATE    |    ──▀▄░▄▀──");
        System.out.println("────█────     ---------------     ────█────");
        System.out.println("──▄▄█▄▄──                         ──▄▄█▄▄──");
        
        System.out.println("\n");
        System.out.println("[1] Cadastrar Cliente");
        System.out.println("[2] Cadastrar Funcionario");
        System.out.println("[3] Procurar Pessoa");
        System.out.println("[4] Listar Todas as Pessoas Cadastradas");
        System.out.println("[5] Excluir Pessoa");
        System.out.println("[6] Excluir Todas as Pessoas Cadastradas");
        System.out.println("|0| Sair...");
        System.out.print("\nInforme uma opção: ");
    }
    
    private static void verificarOpcao(int op) {
        switch (op) {
            case 1: // Cadastrar Cliente
                cadastrarNovoCliente();
                break;
            case 2: // Cadastrar Funcionario
                cadastrarNovoFuncionario();
                break;
            case 3: // Procurar Pessoa
                procurarPessoa();
                break;
            case 4: // Listar Clientes
                listarPessoas();
                break;
            case 5: // Excluir Pessoa
                excluirPessoa();
                break;
            case 6: // Excluir Todas as Pessoas
                excluirTodasPessoas();
                break;
            case 0: // Sair
                System.out.println("\nO programa foi finalizado...");
                break;
            default:
                System.out.println("\nOpção inválida.... Digite novamente...");
                break;
        }
    }

    // Início do cadastro de cliente 
    private static void cadastrarNovoCliente() {
        System.out.println("\nNovo Cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine(); // Lê o nome do cliente...
    
        System.out.print("CPF: ");
        String cpf = scanner.nextLine(); // Lê o CPF do cliente...
    
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine(); // Lê o telefone do cliente....
    
        System.out.print("Visitas: ");
        int visitas = scanner.nextInt(); // Lê o número de visitas do cliente...
        scanner.nextLine(); // Limpa o buffer do scanner
    
        // Cria cliente com as informações...
        Cliente cliente = new Cliente(nome, cpf, telefone, visitas);
    
        // Adiciona o cliente à lista de clientes...
        Cadastro.cadastrar(cliente);
    
        System.out.println("\nCliente cadastrado com sucesso!");
        enterParaSeguir();
    }
    
    private static void procurarPessoa() {
        System.out.println("Informe o CPF do cliente:");
        String cpf = scanner.nextLine();
        for (Pessoa cliente : Cadastro.getListaPessoas()) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente.toString());
                enterParaSeguir();
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
    
    private static void excluirPessoa() {
        System.out.println("Informe o CPF do cliente a ser excluído:");
        String cpf = scanner.nextLine();
        for (Pessoa pessoa : Cadastro.getListaPessoas()) {
            if (pessoa.getCpf().equals(cpf)) {
                Cadastro.getListaPessoas().remove(pessoa);
                System.out.println("Pessoa excluída com sucesso!");
                enterParaSeguir();
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
    
    private static void listarPessoas() {
        if (Cadastro.getListaPessoas().isEmpty()) {
            System.out.println("\nNão há Pessoas cadastradas.");
        } else {
            System.out.println("\nLista de Pessoas:");
            for (Pessoa cliente : Cadastro.getListaPessoas()) {
                System.out.println(cliente.toString());
            }
            enterParaSeguir();
        }
    }

    private static void cadastrarNovoFuncionario() {
        System.out.println("\nNovo Funcionário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine(); // Lê o nome do funcionário...
    
        System.out.print("CPF: ");
        String cpf = scanner.nextLine(); // Lê o CPF do funcionário...
    
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine(); // Lê o telefone do funcionário....
    
        System.out.print("Função: ");
        String funcao = scanner.nextLine(); // Lê a função do funcionário...

        System.out.println("Deseja adicionar o tipo de funcionário:");
        System.out.println("[1] Sim ");
        System.out.println("[2] Não");
        int escolhaTipo = scanner.nextInt();

        if (escolhaTipo == 1) {
            System.out.println("Qual tipo de funcionário deseja cadastrar");
            System.out.println("[1] Registrado");
            System.out.println("[2] Taxa ");
            int tipo = scanner.nextInt();
            switch (tipo) {
                case 1:
                    System.out.println("\nTipo registrado");
                    System.out.println("\nInforme o salário do funcionário");
                    float salario = scanner.nextFloat();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    Registrado registrado = new Registrado(nome, cpf, telefone, funcao, salario);
                    Cadastro.cadastrar(registrado);
                    break;
                case 2:
                    System.out.println("\nTipo Taxa");
                    System.out.println("\nInforme o valor da hora do funcionário");
                    float vlrHora = scanner.nextFloat();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    Taxa taxa = new Taxa(nome, cpf, telefone, funcao, vlrHora);
                    Cadastro.cadastrar(taxa);
                    break;
                default:
                    System.out.println("\nResposta inválida");
                    break;
            }
        } else {
            Funcionario funcionario = new Funcionario(nome, cpf, telefone, funcao);
            Cadastro.cadastrar(funcionario);
        }
        System.out.println("\nFuncionário cadastrado com sucesso!");
        enterParaSeguir();
    }

    private static void excluirTodasPessoas() {
        Cadastro.getListaPessoas().clear();
        System.out.println("\nTodas as pessoas foram excluídas com sucesso!");
    }

    // Método para "pausar o código" e melhorar a legibilidade
    public static void enterParaSeguir() {
        System.out.println("\nClique em qualquer tecla para continuar");
        scanner.nextLine();
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            verificarOpcao(op);
        } while (op != 0);
    }
}
