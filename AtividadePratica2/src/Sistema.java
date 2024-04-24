import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    /*String nome;
        int cpf;
        int telefone;
        int visitas;
        boolean vip;
        String funcao;
        float valorHora;///variaveis ja declaradas nos proprios metodos..*/

    
    private static Scanner scanner = new Scanner(System.in);
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();
    
    private static void exibirMenu() {
        System.out.println("\n");
        System.out.println("─────▄▀──                         ─────▄▀──");
        System.out.println("─█▀▀▀█▀█─     ---------------     ─█▀▀▀█▀█─");
        System.out.println("──▀▄░▄▀──     |     BOATE    |    ──▀▄░▄▀──");
        System.out.println("────█────     ---------------     ────█────");
        System.out.println("──▄▄█▄▄──                         ──▄▄█▄▄──");
        
        
        System.out.println("\nClientes:");
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
        System.out.print("\nInforme uma opção: ");
    }
    
    private static void verificarOpcao(int op) {
        
        
        
        switch (op) {
            case 1: // Cadastrar Cliente
                cadastrarNovoCliente();
                break;
            case 2: // Procurar Cliente
                procurarCliente();
                break;
            case 3: // Excluir Cliente
                excluirCliente();
                break;
            case 4: // Listar Clientes
                listarClientes();
                break;
            case 5: // Cadastrar Funcionario
                cadastrarNovoFuncionario();
                break;
            case 6: // Procurar Funcionario
                procurarFuncionario();
                break;
            case 7: // Excluir Funcionario
                excluirFuncionario();
                break;
            case 8: // Listar Funcionarios
                listarFuncionarios();
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
    
    /* System.out.println("\nNovo Cliente:");
        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("CPF: ");
        int cpf = Console.lerInt();

        System.out.print("Telefone: ");
        int telefone = Console.lerInt();

        System.out.print("Visitas: ");
        int visitas = Console.lerInt();

        System.out.print("Vip: ");
        boolean vip = Console.lerBool();

        Cliente cliente = new Cliente(nome, cpf, telefone, visitas, vip);

        Cadastro.cadastrar(cliente);

        System.out.println("\nCliente cadastrado com sucesso!");*/


        //Teste...
        System.out.println("\nNovo Cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine(); // Le o nome do cliente...
    
        System.out.print("CPF: ");
        int cpf = scanner.nextInt(); // Le o CPF do cliente...
    
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt(); // Le o telefone do cliente....
    
        System.out.print("Visitas: ");
        int visitas = scanner.nextInt(); // Le o número de visitas do cliente...
    
        /*System.out.print("Vip: ");
        boolean vip = scanner.nextBoolean(); // Le se o cliente é VIP ou não...*/
    
        // Cria cliete  com as infos...
        Cliente cliente = new Cliente(nome, cpf, telefone, visitas);
    
        // Adiciona o cliente à lista de clientes...
        listaClientes.add(cliente);
    
        System.out.println("\nCliente cadastrado com sucesso!");

    }//NAo salva o cadastro do cliente, aparece que da certo mas na hora de procurar, excluir ou listar ele nao aparece..
    
    private static void procurarCliente() {//Metodo para procurar clientes cadastrados, caso nao tenha nenhum apresenta mensagem...
        System.out.println("Informe o CPF do cliente:");
        int cpf = scanner.nextInt();
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf) {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("Cliente nao encontrado.");
    }
    
    private static void excluirCliente() {//Metodo para excluir clientes cadastrados, caso nao tenha nenhum apresenta mensagem...
        System.out.println("Informe o CPF do cliente a ser excluido:");
        int cpf = scanner.nextInt();
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf) {
                listaClientes.remove(cliente);
                System.out.println("Cliente excluido com sucesso!");
                return;
            }
        }
        System.out.println("Cliente nao encontrado.");
    }
    
    private static void listarClientes() {//Metodo que lista os clientes cadastrados, caso nao tenha nenhum apresenta mensagem...
        if (listaClientes.size() == 0) {
            System.out.println("\nNao ha clientes cadastrados.");
        } else {
            System.out.println("\nLista de Clientes:");
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }
        }
    }
    //Fim Cliente
    

    //Comeco Funcionario
    private static void cadastrarNovoFuncionario() {//Metodo que cadastra funcionarios, apresenta mensagem de sucesso...

        /*System.out.println("\nNovo Funcionario:");
        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("CPF: ");
        int cpf = Console.lerInt();

        System.out.print("Telefone: ");
        int telefone = Console.lerInt();

        System.out.print("Funcao: ");
        String visitas = Console.lerString();

        
        Funcionario funcionario = new Funcionario(nome, cpf, telefone, visitas);
        Cadastro.cadastrar(funcionario);

        System.out.println("\nFuncionario cadastrado com sucesso!");*/


        System.out.println("\nNovo Funcionario:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine(); // Le o nome do cliente...
    
        System.out.print("CPF: ");
        int cpf = scanner.nextInt(); // Le o CPF do cliente...
    
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt(); // Le o telefone do cliente....
    
        System.out.print("Funcao: ");
        String funcao = scanner.nextLine(); // Le o número de visitas do cliente...
    
        /*System.out.print("Vip: ");
        boolean vip = scanner.nextBoolean(); // Le se o cliente é VIP ou não...*/
    
        // Cria cliete  com as infos...
        Funcionario funcionario = new Funcionario(nome, cpf, telefone, funcao);
    
        // Adiciona o cliente à lista de clientes...
        listaFuncionarios.add(funcionario);
    
        System.out.println("\n cadastrado com sucesso!");
    }
    
    private static void procurarFuncionario() {//Metodo que procura funcionario cadastrado, caso nao tenha apresenta mensagem...
        System.out.println("Informe o CPF do funcionario:");
        int cpf = scanner.nextInt();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getCpf() == cpf) {
                System.out.println("Funcionario encontrado:");
                System.out.println(funcionario);
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }
    
    private static void excluirFuncionario() {//Metodo para excluir funcionario, caso nao tenha apresenta mensagem...
        System.out.println("Informe o CPF do funcionario a ser excluido:");
        int cpf = scanner.nextInt();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getCpf() == cpf) {
                listaFuncionarios.remove(funcionario);
                System.out.println("Funcionario excluido com sucesso!");
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }
    
    private static void listarFuncionarios() {//Metodo para listar funciionarios, caso nao tenha nehum apresenta mensagem...
        if (listaFuncionarios.size() == 0) {
            System.out.println("\nNão há funcionarios cadastrados.");
        } else {
            System.out.println("Lista de Funcionarios:");
            for (Funcionario funcionario : listaFuncionarios) {
                System.out.println(funcionario);
            }
        }
    }
    //Fim Funcionario
    

    public static void executar() {//Metodo que executa o programa quanfo chamado na (main)...

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
        //blablabla
    }
    
    
}
