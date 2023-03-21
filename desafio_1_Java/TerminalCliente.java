package desafio_1_Java;
import java.util.Scanner;

public class TerminalCliente {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		ContaBanco conta1 = new ContaBanco();
		
		System.out.println("Bem-vindo ao Banco X");
		System.out.println("----------------------------------");
		
		System.out.println("Digite o número da conta: ");
		conta1.numeroConta = scanner.nextInt();
		
		System.out.println("Digite o número da agência: ");
		conta1.agencia = scanner.nextInt();
		
		System.out.println("Digite o código da agência: ");
		conta1.codigoAgencia = scanner.nextInt();
		
		System.out.println("Digite seu nome completo: ");
		conta1.nomeCompleto = scanner.next();
		
		System.out.println("Digite o valor para depósito inicial: ");
		conta1.saldoConta = scanner.nextDouble();
		
		System.out.println("----------------------------------");
		
		System.out.println("Olá " + conta1.nomeCompleto + ", obrigado por criar uma conta em nosso banco!" );
	    System.out.println("Sua agência é " + conta1.agencia + "-" + conta1.codigoAgencia);
	    System.out.println("Sua conta é " + conta1.numeroConta + " e seu saldo de R$" + conta1.saldoConta + " já está disponível para saque.");
		
	}

}
