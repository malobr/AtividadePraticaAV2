
public class Cliente extends Pessoa{

    private int visitas;
    //private boolean vip;

    //construtor parametrizado usando super class Pessoa
    public Cliente(String nome, int cpf, int telefone, int visitas/*/, boolean vip*/) {
        super(nome, cpf, telefone);
        this.visitas = visitas;
        //this.vip = vip;
    }

    //Getters e Setters
    public int getVisitas() {
        return visitas;
    }
    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    //Menssagem de apresentação Cliente
    @Override
    public String toString() {
        System.out.println("\n--Cliente--");
        String mensagem = super.toString() + "\nVisitas: " + visitas/*  + "\nVip: " + vip*/ + "\n------------";
        return mensagem;
    }
    


    


    
    
}
