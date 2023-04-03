
public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void cadastraEmBanco(Banco banco) {
        banco.addCliente(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }
}