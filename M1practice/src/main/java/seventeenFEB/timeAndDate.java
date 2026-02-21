package seventeenFEB;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeAndDate {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println(date);
		System.out.println(time);
		LocalDate date1=LocalDate.of(2026, 02, 15);
		System.out.println(date1);
		System.out.println(date1.getDayOfMonth());
		String s="2026-01-15";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-DD");
		LocalDate date2=LocalDate.parse(s,formatter);
		System.out.println(date2);
	}
}