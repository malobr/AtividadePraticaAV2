public class Cliente extends Pessoa{

    private int visitas;
    private boolean vip;
    
    
    
    public Cliente() {}


    public Cliente(String nome, int cpf, int telefone, int visitas, boolean vip) {
        super(nome, cpf, telefone);
        this.visitas = visitas;
        this.vip = vip;
    }



    public int getVisitas() {
        return visitas;
    }
    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }


    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        String mensagem = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getTelefone() + "\nVisitas: " + visitas + "\nVip: " + vip;
        return mensagem;
    }
    


    


    
    
}
