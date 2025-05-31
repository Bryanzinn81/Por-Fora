package exercicios.carro;


public class Carro {
	boolean ligado;
	int marcha;
	int velocidade;
	public  Carro() {
		ligado = false;
		marcha = 0;
		velocidade= 0;
	}
	public void ligarCarro() {
		ligado = true;
		System.out.println("O carro está ligado");
		return ;
	}
	public void desligarCarro() {
		if (marcha == 0 && velocidade == 0) {
			ligado = false;
			System.out.println("O carro foi desligado");
			return ;
		}else if (marcha != 0 && velocidade == 0) {
			System.out.println("A marcha deve estar no ponto morto");
		}else {
			System.out.println("A velocidade deve estar zerada");
		}
		
	}
	public void acelerarVelocidade() {
		velocidade++;
		System.out.println("Aumentando a velocidade do carro");
		return;
	}
	public void diminuirVelocidade() {
		velocidade--;
		System.out.println("Diminuindo a velocidade do carro");
		return ;
	}
	public void virarCarro() {
		if (velocidade <= 40) {
			System.out.println("Virando o Carro");
		}else {
			System.out.println("O carro está muito rapido para virar");
		}
	}
	public void verificarVelocidade() {
		System.out.println("Você está a " + velocidade + "Km/h");
	}
	public void trocarMarcha(int eMarcha) {
		if (eMarcha == 1 && velocidade >= 0 && velocidade <= 20) {
			marcha = 1;
			System.out.println("Mudando para a 1ª marcha");
		} else if (eMarcha == 2 && velocidade >= 10 && velocidade <= 40) {
			marcha = 2;
			System.out.println("Mudando para a 2ª marcha");
		} else if (eMarcha == 3 && velocidade >= 30 && velocidade <= 60) {
			marcha = 3;
			System.out.println("Mudando para a 3ª marcha");
		} else if (eMarcha == 4 && velocidade >= 50 && velocidade <= 80) {
			marcha = 4;
			System.out.println("Mudando para a 4ª marcha");
		} else if (eMarcha == 5 && velocidade >= 70 && velocidade <= 100) {
			marcha = 5;
			System.out.println("Mudando para a 5ª marcha");
		} else if (eMarcha == 6 && velocidade >= 90 && velocidade <= 120) {
			marcha = 6;
			System.out.println("Mudando para a 6ª marcha");
		} else {
			System.out.println("Velocidade incorreta para a marcha " + eMarcha);
		}
	}
}
