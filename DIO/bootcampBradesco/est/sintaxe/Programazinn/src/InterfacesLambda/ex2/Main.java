package InterfacesLambda.ex2;

import java.util.Scanner;


public class Main {
	private  static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		double price= 0;
		while (true) {
			System.out.println("Digite o Valor do Produto: ");
			price = scanner.nextDouble();
			System.out.println("Escolha o tipo do Produto");
			System.out.println("1- ALIMENTAÇÃO");
			System.out.println("2- SAÚDE");
			System.out.println("3-VESTUARIO");
			System.out.println("4- CULTURA");
			System.out.println("5- SAIR");
			option = scanner.nextInt();
			scanner.nextLine();
			if (option ==1){
				Products ali = new Alimentation();
				System.out.println("O valor final do produto: " +  ali.getImpost(price));
			}
			else if (option ==2) {
				Products hea = new Healthy();
				System.out.println("O valor final do produto: " +  hea.getImpost(price));
			}
			else if (option ==3) {
				Products clo= new Clothes();
				System.out.println("O valor final do produto: " +  clo.getImpost(price));

			}else if (option ==4) {
				Products cul = new Culture();
				System.out.println("O valor final do produto: " +  cul.getImpost(price));
				}else if(option == 5){
					
				break;
				
			}else {
				System.out.println("Opção Invalida");
				continue;
			}

		}
	}
	
}
