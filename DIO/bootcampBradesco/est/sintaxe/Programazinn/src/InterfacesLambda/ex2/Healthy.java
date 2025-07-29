package InterfacesLambda.ex2;

public record Healthy() implements Products{

	@Override
	public double getImpost(double value) {
		return value +(value * 0.015) ; 

	}

}
