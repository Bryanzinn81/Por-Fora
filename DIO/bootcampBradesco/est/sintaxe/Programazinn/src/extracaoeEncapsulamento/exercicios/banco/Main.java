package extracaoeEncapsulamento.exercicios.banco;

import java.util.Scanner;

public class Main {
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o valor do primeiro deposito da conta");
		 final double primeiroDeposito = scanner.nextDouble();
		 Conta conta = new Conta(primeiroDeposito);
	var opcao = 0;
	do {
		System.out.println("==Escolha uma das opções==");
		System.out.println("1- Consultar o saldo");
		System.out.println("2- Consultar o cheque especial");
		System.out.println("3- Depositar");
		System.out.println("4- Sacar Dinheiro");
		System.out.println("5- Pagar um boleto");
		System.out.println("6- Verificar o cheque especial");
	
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1 : conta.consultarSaldo();
		break;

		case 2 : conta.consultarChequeEspecial();
		break;

		case 3 :
			System.out.println("Qual vai ser o valor do deposito");
			double valorDep = scanner.nextDouble();
			conta.deposito(valorDep);
			break;
		case 4 :
			System.out.println("Qual vai ser o valor do saque");
			double valorSaq = scanner.nextDouble();
			conta.saque(valorSaq);
			break;
		case 5:
			System.out.println("Qual vai ser o valor do boleto");
			double valorBol = scanner.nextDouble();
			conta.boleto(valorBol);
			break;
		case 6 : conta.verificaCheque();
		break;

		
		 case 0: System.exit(0);
			break;

		 default: System.out.println("Opção Invalida");
			break;

		 }
		
	}while (opcao !=0);
	}

	
	}
	
