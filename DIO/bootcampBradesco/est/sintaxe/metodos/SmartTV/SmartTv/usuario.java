package SmartTv;

public class usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        // ----------------------------------------------

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada ? " + smartTv.ligada);

        // -----------------------------------------------
        smartTv.aumentarVolume();
        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O volume atual é: " + smartTv.volume);

        // ------------------------------------------------

        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.desligar();

    }
}
