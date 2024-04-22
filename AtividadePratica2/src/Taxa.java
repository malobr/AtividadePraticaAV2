public class Taxa extends Funcionario{

    private float valorHora;
<<<<<<< Updated upstream
    private int horasTrabalhadas;
   
   
    public Taxa() {}




    public Taxa(String nome, int cpf, int telefone, String funcao, float valorHora, int horasTrabalhadas) {
        super(nome, cpf, telefone, funcao);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }




    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }



    @Override
    public String toString() {
        String mensagem = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getTelefone() + "\nFunção: " + getFuncao() + "\nHoras trabalhadas: " + horasTrabalhadas;
        return mensagem;
    }
    
=======

>>>>>>> Stashed changes
    
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

    @Override
    public String toString() {
        String menssagem = super.toString() + "Valor da hora: R$" + valorHora;
        return menssagem;
    }
}
