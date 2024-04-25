import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List <Pessoa> listaPessoas = new ArrayList<>();
    public static Object getListaPessoas;

    

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
    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

}