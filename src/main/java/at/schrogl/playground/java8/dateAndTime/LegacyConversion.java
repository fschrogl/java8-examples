package at.schrogl.playground.java8.dateAndTime;

/*-
 * #%L
 * Java 8 Examples
 * %%
 * Copyright (C) 2018 - 2020 Fritz Schrogl
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

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
