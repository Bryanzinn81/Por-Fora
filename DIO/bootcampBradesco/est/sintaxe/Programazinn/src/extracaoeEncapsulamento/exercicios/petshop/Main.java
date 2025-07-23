package extracaoeEncapsulamento.exercicios.petshop;

import java.util.Scanner;

public class Main {
	private final static Scanner scanner = new Scanner(System.in);
	private final static PetMachine  petMachine = new PetMachine();

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var option = 1;
		do {
			System.out.println("==Escolha uma das opções==");
			System.out.println("1- Dar banho no pet");
			System.out.println("2- Abaster a máquina com água");
			System.out.println("3- Abastecer a máquina com shampoo");
			System.out.println("4- Verificar água da máquina");
			System.out.println("5- Verificar shampoo da máquina");
			System.out.println("6- Verificar se tem pet no banho");
			System.out.println("7- Colocar Pet na Maquina");
			System.out.println("8- Retirar o pet da máquina");
			System.out.println("9- Limpar a máquina");
			System.out.println("0- sair");
			option = scanner.nextInt();
			
			switch (option) {
			case 1 -> petMachine.takeShower();
			case 2 -> setWater();
			case 3 -> setShampoo();
			case 4 ->verifyWater();
			case 5 -> verifyShampoo();
			case 6 -> checkIfHasPetInMachine();
			 case 7 -> setPetInPetMachine() ;
			 case 8 -> petMachine.removePet();
			 case 9 -> petMachine.wash();
			 case 0 -> System.exit(0);
			 default -> System.out.println("Opção Invalida");
			 }
			
		}while (option !=0);
	}
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na máquina");
		petMachine.addShampoo();
	}
	private static void setWater() {
		System.out.println("Tentando colocar água na máquina");
		petMachine.addWater();
	}
	private static void verifyWater() {
		var amout = petMachine.getWater();
		System.out.println("A máquina está no momento com " + amout + "litro de shampoo");
	}
	private static void verifyShampoo() {
		var amout = petMachine.getShampoo();
		System.out.println("A máquina está no momento com " + amout + "litro de shampoo");
	}
	private static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "tem pet na máquina" : "Não tem pet na Máquina");
	}
		public static void setPetInPetMachine() {
			var name = "";
			while (name == null || name.isEmpty()) {
				System.out.println("Informe o nome do pet");
				name = scanner.next();
			}
			System.out.println("Informe o nome do Pet");
			name = scanner.next();
			var pet = new Pet(name);
			petMachine.setPet(pet);
			System.out.println("O pet " + pet.getName() + "Foi colocado na máquina");
			
		}
		
		public void getPetFromMachine() {
			petMachine.removePet();
		}
	
	


}
