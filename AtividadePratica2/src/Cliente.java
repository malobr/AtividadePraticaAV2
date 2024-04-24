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

    public boolean isVip() {
        return vip;
    }
    /*public void setVip(boolean vip) {
        this.vip = vip;
    }*/

    //Menssagem de apresentação Cliente
    @Override
    public String toString() {
        String mensagem = super.toString() + "\nVisitas: " + visitas/*  + "\nVip: " + vip*/;
        return mensagem;
    }
    


    


    
    
}
