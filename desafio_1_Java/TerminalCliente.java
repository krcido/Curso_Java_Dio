package desafio_1_Java;
import java.util.Scanner;

public class TerminalCliente {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		ContaBanco conta1 = new ContaBanco();
		
		System.out.println("Bem-vindo ao Banco X");
		System.out.println("----------------------------------");
		
		
		System.out.println("Digite o número da conta: ");
		conta1.setNumeroConta(scanner.nextInt());
		
		System.out.println("Digite o número da agência: ");
		conta1.setAgencia (scanner.nextInt());
		
		System.out.println("Digite o código da agência: ");
		conta1.setCodigoAgencia (scanner.nextInt());
		
		System.out.println("Digite seu nome completo: ");
		conta1.setNomeCompleto(scanner.next());
		
		System.out.println("Digite o valor para depósito inicial: ");
		conta1.setSaldoConta (scanner.nextDouble());
		
		System.out.println("----------------------------------");
		
		System.out.println("Olá " + conta1.getNomeCompleto() + ", obrigado por criar uma conta em nosso banco!" );
	    System.out.println("Sua agência é " + conta1.getAgencia() + "-" + conta1.getCodigoAgencia());
	    System.out.println("Sua conta é " + conta1.getNumeroConta() + " e seu saldo de R$" + conta1.getSaldoConta() + " já está disponível para saque.");
		
		}
}


