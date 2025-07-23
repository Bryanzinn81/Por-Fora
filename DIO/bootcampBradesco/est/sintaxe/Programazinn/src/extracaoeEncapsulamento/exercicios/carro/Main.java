package extracaoeEncapsulamento.exercicios.carro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Carro fox = new Carro();
		var scanner = new Scanner(System.in);
		var option = 1;
		var Emarcha = 0;
		do {
			System.out.println("==Escolha uma das opções==");
			System.out.println("1- Ligar o Carro");
			System.out.println("2- Desligar o Carro");
			System.out.println("3- Acelerar");
			System.out.println("4- Diminuir a velocidade");
			System.out.println("5- Virar");
			System.out.println("6- Verificar a Velocidade");
			System.out.println("7- Trocar a marcha");
			
			option = scanner.nextInt();
			
			switch (option) {
			case 1 : fox.ligarCarro();
			break;
			case 2 : fox.desligarCarro();
			break;
			case 3 : fox.acelerarVelocidade();
			break;
			case 4 : fox.diminuirVelocidade();
			break;
			case 5 : fox.virarCarro();
			break;
			case 6 : fox.verificarVelocidade();
			break;
			case 7 : 
					 System.out.println("==Escolha uma das marchas==");
						System.out.println("1- 1ª Marcha");
						System.out.println("2- 2ª Marcha");
						System.out.println("3- 3ª Marcha");
						System.out.println("4- 4ª Marcha");
						System.out.println("5- 5ª Marcha");
						System.out.println("6- 6ª Marcha");
						Emarcha = scanner.nextInt();
						fox.trocarMarcha(Emarcha);
						break;
			 case 0: System.exit(0);
			 break;
			 default:System.out.println("Opção Invalida");
			 }
			
		}while (option !=0);
	}

}
