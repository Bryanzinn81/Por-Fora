package InterfacesLambda.ex1;
import java.util.Scanner;

public class Main {
	private  static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		String msg = null;
		while (true) {
			System.out.println("Escolha a mensagem que deseja enviar: ");
			msg = scanner.nextLine();
			System.out.println("Escolha a forma de enviar a mensagem");
			System.out.println("1- SMS");
			System.out.println("2- EMAIL");
			System.out.println("3-REDES SOCIAIS");
			System.out.println("4- WHATSAPP");
			System.out.println("5- SAIR");
			option = scanner.nextInt();
			scanner.nextLine();
			if (option ==1){
				Mensages sms = new Sms();
				sms.getMensage(msg);
			}
			else if (option ==2) {
				Mensages eml = new Email();
				eml.getMensage(msg);
			}
			else if (option ==3) {
				Mensages smd = new SocialMedia();
				smd.getMensage(msg);
			}else if (option ==4) {
				Mensages wts = new Whatsapp();
				wts.getMensage(msg);
				}else if(option == 5){
					
				break;
				
			}else {
				System.out.println("Opção Invalida");
				continue;
			}

		}
	}
	
}
