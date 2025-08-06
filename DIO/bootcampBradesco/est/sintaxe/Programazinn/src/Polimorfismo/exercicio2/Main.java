package Polimorfismo.exercicio2;

public class Main {

	public static void main(String[] args) {
		Ingresso vingadores = new Familia(30.99 , 5);
		
		vingadores.setName("Vingadores Ultimato");
		vingadores.setSubtitles(false);
		
		
		System.out.println(vingadores.getName());
		
		String precoFormatado = String.format("R$ %.2f", vingadores.getRealPrice());
        System.out.println("Valor : " + precoFormatado);
		System.out.println(vingadores.getTypeAudio());


	}

}