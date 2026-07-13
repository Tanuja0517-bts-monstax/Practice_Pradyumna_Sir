package java8Features;

import java.time.LocalDate;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class Date_TimeAPI {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's date:"+today.toString());
		
		LocalDate week = today.plusWeeks(3);
		System.out.println("From today after 3 weeks:"+week);
				//LocalDate.of(2024, 12, 6);
		System.out.println();
	}
}
