package InterfacesLambda.ex1;

public record Whatsapp() implements Mensages{

	@Override
	public String getMensage(String mensage) {
		System.out.println("Enviando a seguinte mensagem por Whatsapp:" + mensage);
		return null;
	}

}
