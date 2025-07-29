package InterfacesLambda.ex1;

public record SocialMedia() implements Mensages{

	@Override
	public String getMensage(String mensage) {
		System.out.println("Enviando a seguinte mensagem pelas Redes Sociais:" + mensage);
		return null;
	}

}
