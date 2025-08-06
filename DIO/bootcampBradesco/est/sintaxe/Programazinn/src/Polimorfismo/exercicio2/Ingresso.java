package Polimorfismo.exercicio2;

public class Ingresso {
	private double price;
	private String name;
	private boolean subtitles;
	
	
	public  Ingresso(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public boolean isSubtitles() {
		return subtitles;
	}
	public String getTypeAudio() {
	    return subtitles ? "Legendado" : "Dublado";
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setSubtitles(boolean subtitles) {
		this.subtitles = subtitles;
	}
	public double getRealPrice() {
		return price;
	}
	
}
