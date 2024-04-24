import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Pessoa> listaPessoas = new ArrayList<>();

    //Método que adiciona pessoa a lista
    public static void cadastrar(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }

    //Método para buscar pessoa na lista usando seu CPF
    public static Pessoa buscar(int cpf){
        
        //Passando por todas as pessoas da lista
        for (Pessoa pessoaTemporaria : listaPessoas){
            
            //Testando se a pessoa existe coparando seu cpf
            if (pessoaTemporaria.getCpf() == cpf) {
                //Pessoa encontrada, então retornamos ela
                return pessoaTemporaria;
            }
        }
        //Se a pessoa não for encontrada retornaremos nulo
        return null; 
    }

    /*private static List<Pessoa> listaPessoas = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaPessoas.add(Pessoa);
    }

    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public static Pessoa buscar(int cpf) {

        // percorrer a lista de funcionarios
        for (Pessoa temp : listaPessoas) {

            // verificar se a matricula recebida como paramento é igual
            // a matricula do funcionario atual (temp)
            if (temp.getCpf() == cpf) {

                // se for verdade, retornamos o funcionario atual (temp)
                return temp;
            }

        }
        // se sair do laço, significa que não há funcionário com a matricula
        // igual ao valor do paramentro "matricula" recebido no método
        return null; // entao retornamos "nulo"

    }*/






    
}
