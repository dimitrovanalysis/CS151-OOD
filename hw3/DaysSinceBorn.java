import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DaysSinceBorn{
	public static void main(String args[]) {
		
		ZonedDateTime now = ZonedDateTime.now();
		LocalDate birthDate = LocalDate.of(1996, Month.JULY, 15);
		LocalTime time = LocalTime.of(8, 30);
		ZoneId localZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime born = ZonedDateTime.of(birthDate, time, localZone);
		long days = born.until(now, ChronoUnit.DAYS);

		
		
		System.out.println("Days Since Born : " + days);
		
	}
	
}