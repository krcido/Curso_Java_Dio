public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato() {
        System.out.println("===Extrato conta poupança===");
        imprimirInfoComum();
    }
}
