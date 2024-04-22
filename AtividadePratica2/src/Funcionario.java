public class Funcionario extends Pessoa{

    private String funcao;
    



    public Funcionario() {}

    public Funcionario(String nome, int cpf, int telefone, String funcao) {
        super(nome, cpf, telefone);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    

    @Override
public String toString() {
    String mensagem = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getTelefone() + "\nFunção: " + funcao;
    return mensagem;
}


    
}
