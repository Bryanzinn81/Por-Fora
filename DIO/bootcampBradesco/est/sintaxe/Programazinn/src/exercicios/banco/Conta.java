package exercicios.banco;

public class Conta {
	private double saldo;
	private double chequeEspecialUsado;
	private double chequeEspecial;
	
	public Conta(double saldoInicial) {
		saldo = saldoInicial;
		if(saldoInicial <= 500) {
			chequeEspecial = 50;
		}else {
			chequeEspecial = saldoInicial / 2;
		}
	}
	
	public void consultarSaldo() {
		System.out.println("O saldo Atual da sua conta é: "+ saldo);
		return;
	}
	public void consultarChequeEspecial() {
		System.out.println("O saldo Atual do seu cheque especial: "+ chequeEspecial);
		return;
	}
	public void deposito(double valor) {
		if (chequeEspecialUsado > 0) {
            double valorComTaxa = chequeEspecialUsado * 1.2;
            if (valor >= valorComTaxa) {
                valor -= valorComTaxa;
                chequeEspecialUsado = 0;
                chequeEspecial += chequeEspecialUsado;
                System.out.println("Cheque especial quitado com taxa de R$ " + valorComTaxa);
            } else {
            	chequeEspecialUsado -= valor / 1.2;
                System.out.println("Parcial do cheque especial quitado. Ainda falta: R$ " + (chequeEspecialUsado * 1.2));
                return;
            }
        }
		saldo += valor;
		System.out.println("O saldo atual da conta: R$" + saldo);
	}
	public void saque (double valor) {
		if (valor <= saldo) {
			saldo -= valor ;
			System.out.println("O saldo atual da conta: R$" + saldo);
		}else if ( valor < (saldo + chequeEspecial)) {
			double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
            chequeEspecialUsado += restante;
            System.out.println("Saque usando cheque especial.");
		}else {
			System.out.println("O saldo é insuficiente");
		}
	}
	public void boleto(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		}else if( valor < (saldo + chequeEspecial)) {
			double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
            chequeEspecialUsado += restante;
            System.out.println("pagamento do boleto usando cheque especial");
		}
	}
	public void verificaCheque() {
		if(chequeEspecialUsado>0) {
			System.out.println("Foi usado " + chequeEspecialUsado + " do seu cheque especial");
		}
	}
}
