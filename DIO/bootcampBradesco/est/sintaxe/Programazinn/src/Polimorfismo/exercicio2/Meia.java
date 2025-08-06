package Polimorfismo.exercicio2;

public class Meia extends Ingresso{
	public Meia(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getRealPrice() {
		return getPrice()/2;
	}
}
