package Polimorfismo.exercicio1;

public class Main {

	public static void main(String[] args) {
		Clock brlclock = new BRLClock();
		brlclock.setSecond(0);
		brlclock.setMinute(0);
		 brlclock.setHour(12);

		System.out.println(brlclock.getTime() );
		
		System.out.println(new USClock().convert(brlclock).getTime());
	}

}
