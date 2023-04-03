import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;

    
    public List<Cliente> clientes;

    public Banco(String nome){
        this.clientes = new ArrayList<>();
        this.nome = nome;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void listarClientes(){
        System.out.println(this.clientes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
