public class Funcionario extends Pessoa{

    private String funcao;
<<<<<<< Updated upstream
    



    public Funcionario() {}

=======

    //construtor parametrizado usando super class Pessoa
>>>>>>> Stashed changes
    public Funcionario(String nome, int cpf, int telefone, String funcao) {
        super(nome, cpf, telefone);
        this.funcao = funcao;
    }

<<<<<<< Updated upstream
    public String getFuncao() {
=======
    //Getters & Setters
    public String getFuncao(){
>>>>>>> Stashed changes
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
<<<<<<< Updated upstream


    

    @Override
public String toString() {
    String mensagem = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getTelefone() + "\nFunção: " + funcao;
    return mensagem;
}

=======
    
    //ToString

    @Override
    public String toString() {
        String menssagem = super.toString() + "+\nFunção: "+funcao;
        return menssagem;
    }
>>>>>>> Stashed changes

    
}
