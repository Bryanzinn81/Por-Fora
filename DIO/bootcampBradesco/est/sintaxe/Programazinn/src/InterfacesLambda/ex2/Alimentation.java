package InterfacesLambda.ex2;

public record Alimentation() implements Products{

	@Override
	public double getImpost(double value) {
		return value +(value * 0.01) ; 
	}

}
