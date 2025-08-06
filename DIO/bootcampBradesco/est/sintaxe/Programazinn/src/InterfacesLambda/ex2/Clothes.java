package InterfacesLambda.ex2;

public record Clothes() implements Products{

	@Override
	public double getImpost(double value) {
		return value +(value * 0.025) ; 

	}

}
