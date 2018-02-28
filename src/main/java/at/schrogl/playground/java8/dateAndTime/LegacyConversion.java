package at.schrogl.playground.java8.dateAndTime;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Für die Konvertierung der alten Date API auf die neue und vice versa gibt es 5 Methoden.
 */
public class LegacyConversion {

	public void conversions() {
		// Instant <=> Date
		Date.from(Instant.now());
		new Date().toInstant();
		
		// Instant <=> Calendar
		Calendar.getInstance().toInstant();
		Calendar.getInstance().setTime(Date.from(Instant.now()));
		
		// GregorianCalendar <=> ZonedDateTime
		GregorianCalendar.from(ZonedDateTime.now());
		new GregorianCalendar().toZonedDateTime();
	}

}
