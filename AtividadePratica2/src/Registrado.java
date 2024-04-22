<<<<<<< Updated upstream
public class Registrado extends Funcionario {
    private float salario;


    public Registrado() {}

    public Registrado(String nome, int cpf, int telefone, String funcao, float salario) {
        super(nome, cpf, telefone, funcao);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    @Override
    public String toString() {
    String mensagem = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getTelefone() + "\nFunção: " + getFuncao() + "\nSalario: " + salario;
    return mensagem;
}




=======
public class Registrado extends Funcionario{

    private float salario;

>>>>>>> Stashed changes
    
    //construtor parametrizado usando super class Pessoa e Funcionario
    public Registrado(String nome, int cpf, int telefone, String funcao, float salario) {
        super(nome, cpf, telefone, funcao);
        this.salario = salario;
    }

    //Getter e Setters
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String menssagem = super.toString() + "Salario: R$" + salario;
        return menssagem;
    }

}
