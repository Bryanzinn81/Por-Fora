package InterfacesLambda.ex3;

import java.util.Scanner;

public class Main {
	private  static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		GeometricForm geomatricForm= null;
		while (true) {
			System.out.println("Escolha a forma geométrica para calcular a área");
			System.out.println("1- Quadrado");
			System.out.println("2- Retangulo");
			System.out.println("3-Circulo");
			System.out.println("4- Sair do programa");
			option = scanner.nextInt();
			if (option ==1){
				geomatricForm =createSquare();
			}
			else if (option ==2) {
				geomatricForm = createRectangle();
			}
			else if (option ==3) {
				geomatricForm = createCircle();
			}else if(option == 4){
				break;
				
			}else {
				System.out.println("Opção Invalida");
				continue;
			}
			System.out.println("O resultado do cálculo da área é de " + geomatricForm.getArea());

		}
	}
	private static GeometricForm createSquare() {
		System.out.println("Informe os tamanhos dos lados");
		var side = scanner.nextDouble();
		return new Square(side);
	}
	private static GeometricForm createRectangle() {
		System.out.println("Informe a base");
		var base = scanner.nextDouble();
		System.out.println("Informe a altura");
		var height = scanner.nextDouble();
		return new Rectangle(height, base);
	}
	private static GeometricForm createCircle() {
		System.out.println("Informe o raio:");
		var radius = scanner.nextDouble();
		return new Circle(radius);
	}

}
