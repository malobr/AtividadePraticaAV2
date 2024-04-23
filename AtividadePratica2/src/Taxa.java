public class Taxa extends Funcionario{

    private float valorHora;
    
    
    //construtor parametrizado usando super class Pessoa e Funcionario
    public Taxa(String nome, int cpf, int telefone, String funcao, float valorHora) {
        super(nome, cpf, telefone, funcao);
        this.valorHora = valorHora;
    }

    //Getters e Setters
    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    //Menssagem de apresentação Taxa
    @Override
    public String toString() {
        String menssagem = super.toString() + "Valor da hora: R$" + valorHora;
        return menssagem;
    }
}
