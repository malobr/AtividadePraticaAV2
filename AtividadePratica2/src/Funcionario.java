
public class Funcionario extends Pessoa{

    private String funcao;

    //construtor parametrizado usando super class Pessoa
    public Funcionario(String nome, int cpf, int telefone, String funcao) {
        super(nome, cpf, telefone);
        this.funcao = funcao;
    }
    //Getters & Setters
    public String getFuncao(){
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    ///Menssagem de apresentação Funcionario
    @Override
    public String toString() {
        System.out.println("\n--Funcionario--");
        String menssagem = super.toString() + "\nFunção: " + funcao;
        return menssagem;
    }
    
}
