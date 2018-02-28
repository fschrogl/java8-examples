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
