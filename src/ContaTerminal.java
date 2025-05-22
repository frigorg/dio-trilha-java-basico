import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo! Digite seu nome para continuar.");
		String nomeCliente = sc.nextLine();
						
		System.out.println("Por favor, digite o número da agência!");
		String agencia = sc.nextLine();
		
		System.out.println("Qual é o número de conta?");
		int numeroConta = sc.nextInt();
		
		System.out.println("Quanto será o primeiro depósito?");
		Double saldo = sc.nextDouble();
		
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
		
		sc.close();

	}

}
