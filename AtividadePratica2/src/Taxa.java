public class Taxa extends Funcionario{

    private float valorHora;
    //private float horasTrabalhadas;??
    
    //construtor parametrizado usando super class Pessoa e Funcionario
    public Taxa(String nome, String cpf, String telefone, String funcao, float valorHora) {
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
        String menssagem = super.toString() + "\nValor da hora: R$" + valorHora + "\n------------";//Correcao de erros
        return menssagem;
    }
}