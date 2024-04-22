public class Pessoa {
    private String nome;
    private int cpf;
    private int telefone;
    
    public Pessoa(){}//Construtor padrao


    public Pessoa(String nome, int cpf, int telefone) {//Construtor com parametros
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }




    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }



    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        String menssagem = "Nome: " + nome + "\nCPF: " + cpf;
        return menssagem;
    }

    

    
}
