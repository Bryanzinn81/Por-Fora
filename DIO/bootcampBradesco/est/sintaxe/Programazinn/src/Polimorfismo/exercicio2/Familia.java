package Polimorfismo.exercicio2;

public class Familia extends Ingresso{
	private int sizeFamily;

	public Familia(double price, int sizeFamily) {
		super(price);
		this.sizeFamily = sizeFamily;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getRealPrice() {
		double total = getPrice() * sizeFamily;
		 if (sizeFamily > 3) {
	            total *= 0.95; // aplica 5% de desconto
	        }
	        return total;
	}
}

