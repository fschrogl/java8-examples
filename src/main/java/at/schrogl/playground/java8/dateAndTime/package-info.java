/**
 * Eine neue Date and Time API (JSR-310) wurde auch in Java 8 eingebracht.
 * <p>
 * Die Idee stammt von JodaTime und ist mittlerweile der dritte Versuch eine sinnvolle Date and Time API in Java zur Verfügung zu stellen.
 * Versuch 1 war {@link java.util.Date}, Versuch 2 war {@link java.util.Calendar} und Versuch 3 ist nun JSR-310.
 * <p>
 * <b>Probleme mit Date und Calendar</b>
 * <ul>
 * <li>Date ist umständlich zu bedienen und bietet nur eine rudimäntere Abstraktion von "Millis since Epoch". Zusätzlich sind sehr viele
 * Methoden von Date mittlerweile <code>deprecated</code>
 * <li>Calendar bietet eine bessere API als Date, allerdings wird Calendar schnell mühsam, wenn man nur mit einem Datum rechnen will und sich
 * nicht für die Uhrzeit interessiert
 * <li>Die Klassen der alten Date API sind <i>mutable</i> und daher für Multi-threading schlecht geeignet
 * <li>man kann Calendar-Objekte nicht formatiert ausgeben
 * <li>etc.
 * </ul>
 * Die neue API wird in {@link at.schrogl.playground.java8.dateAndTime.JodaTime} vorgestellt und verwendet. Das Konvertieren zwischen der neuen
 * und der alten Date API wird in {@link at.schrogl.playground.java8.dateAndTime.LegacyConversion} behandelt.
 */
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
