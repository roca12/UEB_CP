import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateChecker {

	public static void main(String[] args) {

		Thread t = new Thread() {
			@Override
			public void run() {
				while (true) {
					LocalDateTime now = LocalDateTime.now();
					now.atZone(ZoneId.of("America/Bogota"));
					if (now.getDayOfWeek().equals(DayOfWeek.MONDAY) || now.getDayOfWeek().equals(DayOfWeek.TUESDAY)
							|| now.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
						if (now.getHour() == 20 && now.getMinute() == 15 && now.getSecond() == 00) {
							System.out.println("llamar funcion aqui");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					}
				}
			}
		};
		t.start();
	}
}
