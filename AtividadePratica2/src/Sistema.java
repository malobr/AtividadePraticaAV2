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
        int visitas;
        boolean vip;
        String funcao;
        float valorHora;
        float salario;
        int horasTrabalhadas;
        


        switch (op) {

            case 1://Cadastrar Cliente

                

                break;

            case 2://Procurar Cliente

                

                break;

            case 3://Excluir Clientes

                
                

                

                break;

            case 4://Listar clientes

               

                break;

            case 5://Cadastrar Funcionario

                

            break;

            case 6://Procurar Funcionario

                

            break;

            case 7://Excluir Funcionario

                

            break;
            case 8://Listar Funcionario

                

            break;
        
            case 0://Sair

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
