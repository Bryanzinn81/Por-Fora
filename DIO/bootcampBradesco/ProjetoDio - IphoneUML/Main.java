	package IphoneUML;
	
	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int option = 0;
			int optionM = 0;
			Iphone iphone = new Iphone();
			do {
				System.out.println("Este é o seu Iphone. Qual função deseja usar?");
				System.out.println("========================================");
				System.out.println("1- REPRODUTOR MÚSICAL");
				System.out.println("2- APARELHO TELEFÔNICO");
				System.out.println("3- NAVEGADOR NA WEB");
				System.out.println("4- BLOQUEAR TELEFONE");
				option = scanner.nextInt();
				scanner.nextLine();
				if (option == 1) {
				    do {
				        System.out.println("Qual função do Reprodutor Musical vai usar?");
				        System.out.println("========================================");
				        System.out.println("1- DAR PLAY NA MÚSICA");
				        System.out.println("2- PAUSAR MÚSICA");
				        System.out.println("3- SELECIONAR MÚSICA");
				        System.out.println("4- VOLTAR AO MENU PRINCIPAL");
				        optionM = scanner.nextInt();
				        scanner.nextLine();
				        switch (optionM) {
				            case 1:
				                iphone.play();
				                break;
				            case 2:
				                iphone.pause();
				                break;
				            case 3:
				                System.out.println("Digite a música desejada:");
				                String msc = scanner.nextLine();
				                iphone.selectMusic(msc);
				                break;
				            case 4:
				                System.out.println("Voltando ao menu principal...");
				                break;
				            default:
				                System.out.println("Opção inválida. Tente novamente.");
				        }
				    } while (optionM != 4);
				}else if (option == 2) {
				    do {
				        System.out.println("Qual função do Reprodutor de Chamadas vai usar?");
				        System.out.println("========================================");
				        System.out.println("1- LIGAR");
				        System.out.println("2- ATENDER");
				        System.out.println("3- INICIAR CORREIO DE VOZ");
				        System.out.println("4- VOLTAR AO MENU PRINCIPAL");
				        optionM = scanner.nextInt();
				        scanner.nextLine();
				        switch (optionM) {
				            case 1:
				            	System.out.println("Digite o número que deseja ligar:");
				                String number = scanner.nextLine();
				                iphone.call(number);
				                break;
				            case 2:
				                iphone.acceptCall();
				                break;
				            case 3:
				                iphone.startVoicemail();
				                break;
				            case 4:
				                System.out.println("Voltando ao menu principal...");
				                break;
				            default:
				                System.out.println("Opção inválida. Tente novamente.");
				        }
				    } while (optionM != 4);
				}else if (option == 3) {
				    do {
				        System.out.println("Qual função do Navegador Web vai usar?");
				        System.out.println("========================================");
				        System.out.println("1- ENTRAR EM PAGINA");
				        System.out.println("2- ADICIONAR NOVA PAGINA");
				        System.out.println("3- ATUALIZAR PAGINA");
				        System.out.println("4- VOLTAR AO MENU PRINCIPAL");
				        optionM = scanner.nextInt();
				        scanner.nextLine();
				        switch (optionM) {
				            case 1:
				            	System.out.println("DIGITE O LINK DA WEB: ");
				                String web = scanner.nextLine();
				                iphone.viewPage(web);
				                break;
				            case 2:
				                iphone.newPage();
				                break;
				            case 3:
				                iphone.reloadPage();
				                break;
				            case 4:
				                System.out.println("Voltando ao menu principal...");
				                break;
				            default:
				                System.out.println("Opção inválida. Tente novamente.");
				        }
				    } while (optionM != 4);
				}else if (option == 4) {
					break;
				}else {
					System.out.println("Opção Invalida");
					continue;
				}
			
			} while (true);
			scanner.close();
		}
	
	}
