package InterfacesLambda.ex1;

public record Sms() implements Mensages{

	@Override
	public String getMensage(String mensage) {
		System.out.println("Enviando a seguinte mensagem por sms:" + mensage);
		return null;
	}
 
}
