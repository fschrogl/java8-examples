package at.schrogl.playground.java8.dateAndTime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Diese Klasse zeigt wie man JSR-310 (JodaTime) verwendet.
 * <p>
 * In JodaTime sind alle Klassen <b>immutable</b>, somit thread-sicher und unproblematisch im Multithreading-Context. In JodaTime gibt es grob 3
 * Arten von Zeitklassen, die man je nach Anwendungsfall verwendet:
 * <ol>
 * <li><i>Systemzeit</i> - möchte man mit der kontinuierlichen Maschinenzeit seit Epoc rechnen, so verwendet man am besten die Klassen
 * {@link Instant}, {@link ChronoUnit}, {@link Duration}, etc.
 * <li><i>Lokale Zeit</i> - möchte man mit der lokalen Zeit rechnen und hat daher keine Verwendung für Zeitzonen, so verwendet man am besten die
 * Klassen {@link LocalTime}, {@link LocalDate}, {@link LocalDateTime}, {@link Period}, etc.
 * <li><i>Internationale Zeit</i> - möchte man mit internationaler Zeit rechnen, so benötigt man Zeitzonen und verwendet die Klassen
 * {@link ZonedDateTime}, etc.
 * </ol>
 * Darüber hinaus wurde die Klasse {@link Clock} als Utility-Klasse eingeführt.
 */
@SuppressWarnings("unused")
public class JodaTime {

	public void systemzeit() {
		// Instant erzeugen
		Instant departureTime1 = Instant.now();
		Instant departureTime2 = Instant.parse("2016-02-27T20:15:00Z");

		// Rechnen mit Instant
		Instant expectedArrivalTime1 = departureTime1.plus(7, ChronoUnit.HOURS);
		Instant expectedArrivalTime2 = departureTime1.plus(Duration.ofHours(7));
		long inBetweenMinutes = ChronoUnit.MINUTES.between(departureTime1, expectedArrivalTime1);

		// Duration beschreibt eine Zeitdauer in Nanosekunden
		Duration.ofMinutes(27);
		Duration.parse("P3DT1H12M3S"); /* 3 Tage 1 Stunde 12 Minuten, 3 Sekunden */

		// Instant/Duration kann maximal bis zu einer Zeiteinheit von Stunden rechnen.
		// Folgendes wurde zu einer RuntimeException führen!
		Instant.now().plus(1, ChronoUnit.WEEKS); /* Exception! */
	}

	public void lokaleZeit() {
		// Zur Minimierung von Verwirrrungen gibt es jetzt Month als Enumeration
		LocalDate birthday1 = LocalDate.of(1983, 3, 24);
		LocalDate birthday2 = LocalDate.of(1983, Month.MARCH, 24);
		LocalTime time1 = LocalTime.of(20, 15);
		LocalDateTime dateTime1 = LocalDateTime.of(2001, 2, 23, 20, 15);
		LocalDateTime dateTime2 = LocalDateTime.of(birthday1, time1);

		// Rechnen mit LocalDate
		birthday1.minusWeeks(1).plus(Period.ofDays(3));
		birthday1.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)); /* Letzer Freitag des Monats */
		birthday1.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY)); /* 3. Dienstag im Monat */

		/* Das was Duration für Instant ist, ist Period für LocalDate/Time */
		Period.ofYears(2).withMonths(2).withDays(1);
	}

	public void internationaleZeit() {
		ZonedDateTime now = ZonedDateTime.now();
		ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Europe/Vienna"));

		now.plus(3, ChronoUnit.HOURS);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(now.format(formatter));
	}

	public void clock() {
		Clock.systemUTC();
		Clock.systemDefaultZone();
	}

}
