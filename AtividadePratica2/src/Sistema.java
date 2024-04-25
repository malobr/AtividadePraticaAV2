
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
            case 5: // Cadastrar Funcionario
                excluirPessoa();
                break;
            case 6: // Procurar Funcionario
                excluirTodasPessoas();
                break;
            case 0: // Sair
                System.out.println("\nO programa foi finalizado...");
                break;
            default:
                System.out.println("\nOpção invalida.... Digite novamente...");
                break;
        }
    }

    


    //Comeco cliente 
    private static void cadastrarNovoCliente() {//Metodo de cadastro de novos clientes, apresenta mensagem de sucesso...

        System.out.println("\nNovo Cliente:");
        System.out.print("Nome: ");
        String nome = Console.lerString(); // Le o nome do cliente...
    
        System.out.print("CPF: ");
        int cpf = Console.lerInt(); // Le o CPF do cliente...
    
        System.out.print("Telefone: ");
        int telefone = Console.lerInt(); // Le o telefone do cliente....
    
        System.out.print("Visitas: ");
        int visitas = Console.lerInt(); // Le o número de visitas do cliente...
    
        // Cria cliete  com as infos...
        Cliente cliente = new Cliente(nome, cpf, telefone, visitas);
    
        // Adiciona o cliente à lista de clientes...
        Cadastro.cadastrar(cliente);
    
        System.out.println("\nCliente cadastrado com sucesso!");
        enterParaSeguir();

    }//NAo salva o cadastro do cliente, aparece que da certo mas na hora de procurar, excluir ou listar ele nao aparece..
    
    private static void procurarPessoa() {//Metodo para procurar clientes cadastrados, caso nao tenha nenhum apresenta mensagem...
        System.out.println("Informe o CPF do cliente:");
        int cpf = Console.lerInt();
        for (Pessoa cliente : Cadastro.getListaPessoas()) {
            if (cliente.getCpf() == cpf) {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente.toString());
                enterParaSeguir();

                return;
            }
        }
        System.out.println("Cliente nao encontrado.");
    }
    
    private static void excluirPessoa() {//Metodo para excluir clientes cadastrados, caso nao tenha nenhum apresenta mensagem...
        System.out.println("Informe o CPF do cliente a ser excluido:");
        int cpf = Console.lerInt();
        for (Pessoa pessoa : Cadastro.getListaPessoas()) {
            if (pessoa.getCpf() == cpf) {
                Cadastro.getListaPessoas().remove(pessoa);
                System.out.println("Pessoa excluida com sucesso!");
                enterParaSeguir();
                return;
            }
        }
        System.out.println("Cliente nao encontrado.");
    }
    
    private static void listarPessoas() {//Metodo que lista os clientes cadastrados, caso nao tenha nenhum apresenta mensagem...
        if (Cadastro.getListaPessoas().size() == 0) {
            System.out.println("\nNao ha Pessoas cadastradas.");
        } else {
            System.out.println("\nLista de Pessoas:");
            for (Pessoa cliente : Cadastro.getListaPessoas()) {
                System.out.println(cliente.toString());
            }
            enterParaSeguir();
        }
    }

    private static void cadastrarNovoFuncionario() {//Metodo que cadastra funcionarios, apresenta mensagem de sucesso...

        System.out.println("\nNovo Funcionario:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine(); // Le o nome do cliente...
    
        System.out.print("CPF: ");
        int cpf = Console.lerInt(); // Le o CPF do cliente...
    
        System.out.print("Telefone: ");
        int telefone = Console.lerInt(); // Le o telefone do cliente....
    
        System.out.print("Funcao: ");
        String funcao = Console.lerString(); // Le a funvcao do funcionario

        System.out.println("Deseja adicionar o tipo de funcionario:");
        System.out.println("[1] Sim ");
        System.out.println("[2] Não");
        int escolhaTipo = Console.lerInt();

        if (escolhaTipo == 1) {
            System.out.println("Qual tipo de funcionario deseja cadastrar");
            System.out.println("[1] Registrado");
            System.out.println("[2] Taxa ");
            int tipo = Console.lerInt();
            switch (tipo) {
                case 1:
                    System.out.println("\nTipo registrado");
                    System.out.println("\nInforme o salario do funcionario");
                    float salario = Console.lerFloat();

                    Registrado registrado = new Registrado(nome, cpf, telefone, funcao, salario);
                    Cadastro.cadastrar(registrado);


                    break;
                case 2:
                
                    System.out.println("\nTipo Taxa");
                    System.out.println("\nInforme o valor da hora do funcionario");
                    float vlrHora = Console.lerFloat();

                    Taxa taxa = new Taxa(nome, cpf, telefone, funcao, vlrHora);
                    Cadastro.cadastrar(taxa);
                    
                    break;
                default:
                    System.out.println("\nResposta inválida");
                    break;
            }
            
        }else{
        // Cria cliete  com as infos...
        Funcionario funcionario = new Funcionario(nome, cpf, telefone, funcao);
    
        // Adiciona o cliente à lista de clientes...
        Cadastro.cadastrar(funcionario);
    
        }
        System.out.println("\nFuncionario cadastrado com sucesso!");
        enterParaSeguir();
    }
  
    private static void excluirTodasPessoas() {
        Cadastro.getListaPessoas() .clear();
        System.out.println("\nTodas as pessoas foram excluídas com sucesso!");
    }

    //metodo que "Pausa o código" para melhorar a legibilidade
    public static void enterParaSeguir(){
        System.out.println("\nClique em qualquer tecla para continuar");
        Console.lerString();
    }

    public static void executar() {//Metodo que executa o programa quanfo chamado na (main)...

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
    }
    
    
    
}
