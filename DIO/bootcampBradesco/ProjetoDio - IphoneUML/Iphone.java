package IphoneUML;

public class Iphone implements Music, Dispositive, Web{

	@Override
	public void play() {
		System.out.println("Dando o play na música");
	}
	@Override
	public void pause()  {
		System.out.println("Pausando a música");
	}
	@Override
	public void selectMusic(String music) {
		System.out.println("Selecionando a música: " + music);
	}
	@Override
	public void reloadPage()  {
		System.out.println("Recarregando página");
	}
	@Override
	public void newPage()  {
		System.out.println("Abrindo nova página");
	}
	@Override
	public void viewPage(String url){
		System.out.println("Entrando no link: " + url);
	}
	@Override
	public void startVoicemail()  {
		System.out.println("Iniciando a caixa de ligação");
	}
	@Override
	public void acceptCall() {
		System.out.println("Atendendo a ligação");
	}
	@Override
	public void call(String number) {
		System.out.println("Ligando para o número: " + number + " ...");
	}
	
}
