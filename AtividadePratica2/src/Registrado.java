public class Registrado extends Funcionario {
    private float salario;
    
    //construtor parametrizado usando super class Pessoa e Funcionario
    public Registrado(String nome, String cpf, String telefone, String funcao, float salario) {
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

    //Menssagem de apresentação Registrado
    @Override
    public String toString() {
        String menssagem = super.toString() + "\nSalario: R$ " + salario + "\n------------";//CORRIGIDO
        return menssagem;
    }

}
