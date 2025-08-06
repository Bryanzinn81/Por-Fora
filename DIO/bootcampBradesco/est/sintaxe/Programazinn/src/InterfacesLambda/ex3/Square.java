package InterfacesLambda.ex3;

public record Square(double side) implements GeometricForm {

	public double getArea(){
		return side * side;
	}
	
}
