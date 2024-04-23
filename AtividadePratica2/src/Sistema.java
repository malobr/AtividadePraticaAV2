import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    private static void exibirMenu() {
        System.out.println("---------------");
        System.out.println("|     BOATE    |");
        System.out.println("---------------");
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
        System.out.print("Informe uma opção: ");
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
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    
   

    private static void cadastrarNovoCliente() {
       
        System.out.println("\nNovo Cliente:");
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

        System.out.println("\nCliente cadastrado com sucesso!");

    }//NAo salva o cadastro do cliente, aparece que da certo mas na hora de procurar, excluir ou listar ele nao aparece..
    
    private static void procurarCliente() {
        System.out.println("Informe o CPF do cliente:");
        int cpf = scanner.nextInt();
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf) {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
    
    private static void excluirCliente() {
        System.out.println("Informe o CPF do cliente a ser excluído:");
        int cpf = scanner.nextInt();
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf) {
                listaClientes.remove(cliente);
                System.out.println("Cliente excluído com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
    
    private static void listarClientes() {
        if (listaClientes.size() == 0) {
            System.out.println("\nNão há clientes cadastrados.");
        } else {
            System.out.println("\nLista de Clientes:");
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }
        }
    }
    
    
    private static void cadastrarNovoFuncionario() {
       
    }
    
    private static void procurarFuncionario() {
        System.out.println("Informe o CPF do funcionário:");
        int cpf = scanner.nextInt();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getCpf() == cpf) {
                System.out.println("Funcionário encontrado:");
                System.out.println(funcionario);
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }
    
    private static void excluirFuncionario() {
        System.out.println("Informe o CPF do funcionário a ser excluído:");
        int cpf = scanner.nextInt();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getCpf() == cpf) {
                listaFuncionarios.remove(funcionario);
                System.out.println("Funcionário excluído com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }
    
    private static void listarFuncionarios() {
        if (listaFuncionarios.size() == 0) {
            System.out.println("\nNão há funcionários cadastrados.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario funcionario : listaFuncionarios) {
                System.out.println(funcionario);
            }
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
