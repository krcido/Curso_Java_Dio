public abstract class Conta implements IConta{
    protected int agencia, numero;
    protected double saldo;
    private static int agenciaPadrao = 1;
    private static int SEQUENCIAL = 001;
    private Banco banco;
    private Cliente cliente;
    
    public Conta(Cliente cliente, Banco banco){
        this.agencia = Conta.agenciaPadrao;
        this.numero = SEQUENCIAL++;
        this.banco = banco;
        this.cliente = cliente;
       

    }

    
    public void sacar(double valor) {
        this.saldo -= valor;
    }


    public void depositar(double valor) {
        saldo += valor;
    }

    
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    } 

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void imprimirInfoComum(){
      
        System.out.println("Nome cliente: " + this.cliente);
        System.out.println(String.format("Agencia %d", agencia));
        System.out.println(String.format("Número %d", numero));
        System.out.println(String.format("Saldo %.2f", saldo));
    }
}