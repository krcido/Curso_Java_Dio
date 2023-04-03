public class Main {
    public static void main(String[] args) {    
        Banco safra = new Banco("Safra");
        Cliente cliente1 = new Cliente("Sergio");
        cliente1.cadastraEmBanco(safra);
        Cliente cliente2 = new Cliente("José");
        cliente2.cadastraEmBanco(safra);
        safra.listarClientes();

        ContaCorrente cc1 = new ContaCorrente(cliente1, safra);
        cc1.depositar(5000);
        System.out.println(cc1.getSaldo());
        ContaPoupanca cc2 = new ContaPoupanca(cliente2, safra);
        cc1.transferir(3000, cc2);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        cc2.sacar(1700);
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}