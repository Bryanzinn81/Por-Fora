package InterfacesLambda.ex1;

public record Email() implements Mensages{

	@Override
	public String getMensage(String mensage) {
		System.out.println("Enviando a seguinte mensagem por email:" + mensage);
		return null;
	}

}
