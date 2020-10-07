package at.schrogl.playground.java8.bulkOperations.streams;

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

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Die Klasse zeigt wie man Streams grundsätzlich verwendet. Für jeden Operationstyp gibt es eine Methode. Die Operationstypen sind:
 * <ol>
 * <li>Create - Stream erzeugen
 * <li>Intermediate - Stream bearbeiten
 * <li>Terminate - Stream starten und Ergebnis erzeugen
 * </ol>
 */
@SuppressWarnings("unused")
public class BasicStreams {

	/**
	 * Streams kann man auf 2 Arten erzeugen:
	 * <ol>
	 * <li>aus Arrays und Collections
	 * <li>per Funktion/Generator (unendliche Streams)
	 * </ol>
	 * Per Default werdne die Streams als sequentielle Streams erzeugt.
	 */
	public void createStreams() {
		/* Streams aus Arrays und Collections */
		final String[] namesArray = { "Karl", "Ralph", "Max" };
		final List<String> namesCollection = Arrays.asList(namesArray);
		Stream<String> streamFromArray = Arrays.stream(namesArray);
		Stream<String> streamFromList = namesCollection.stream();

		/* Streams durch Funktionen (unendliche Streams) */
		Stream.of("Karl", "Ralph", "Max");

		IntStream.range(3, 100);
		IntStream.iterate(0, x -> x + 1);

		AtomicInteger ai = new AtomicInteger(0);
		Stream.generate(ai::getAndDecrement);

		Stream.iterate(0, x -> x + 1).skip(5).limit(100);
	}

	/**
	 * Die <i>Stateless Intermediate Operations</i> zeichnen sich dadurch aus, dass sie auf den einzelnen Elementen eines Streams unabhängig
	 * voneinander ausgeführt werden können. Dadurch eignen sich die zustandlosen Intermediate Operationen hervorragend für die
	 * Parallelisierung.
	 * <p>
	 * Zustandslose Intermediate Operations sind u.a.: <code>filter(), map(), flatMap(), peek()</code>
	 */
	public void statelessIntermediateOperations() {
		Stream.of("Max", "Ralph", "Karl")
				.filter(name -> name.startsWith("M"))
				.collect(Collectors.toList());
	}

	/**
	 * Die <i>Stateful Intermediate Operations</i> zeichnen sich dadurch aus, dass sie, wenn sie auf einem Element des Streams ausgeführt
	 * werden, über die anderen Elemente des Streams bescheid wissen müssen. Beispiel sind die Operationen <code>sort(), distinct()</code>: ich
	 * kann ein Element nur einordnen bzw. Duplikate nur entfernen, wenn ich weiß welche Werte die anderen Elemente haben bzw. ob andere
	 * Elemente ident sind. Dadurch können zustandsbehaftete Intermediate Operations nicht so gut parallelisiert werden!
	 * <p>
	 * Im Unterschied zu Collections können Streams bei der Verarbeitung jedoch meistens partitioniert werden und dadurch ist Parallelisierung
	 * in gewissem Maße möglich (fork/join).
	 * <p>
	 * Zustandsbehaftete Intermediate Operations sind u.a.: <code>sort(), distinct(), limit(), skip()</code>
	 */
	public void statefulIntermediateOperations() {
		Stream.of("Max", "Ralph", "Max", "Karl")
				.distinct()
				.collect(Collectors.toList());
	}

	/**
	 * Eine Terminal Operation startet die Verarbeitung eines Streams. Wurde eine Terminal Operation auf einem Streams ausgeführt, so ist dieser
	 * anschließend "verbraucht" und wirft bei weiterer Verwendung eine {@link IllegalStateException}
	 * <p>
	 * Terminal Operations sind u.a.: <code>forEach(), toArray(), collect(), reduce(), count(), *match(), find*()</code>
	 */
	public void terminalOperations() {
		Stream.of(1, 3, 5, 9, 12, 2, 3)
				.reduce((x, y) -> (x + y));
	}

	/**
	 * Streams haben zwei Nachteile bei der Entwicklung: (1) ihre Verarbeitung wird erst durch die Terminal Operation gestartet und (2) nach der
	 * Terminal Operation ist der Stream verbraucht, kann also nicht weiter verwendet werden. Diese Eigenschaften erschweren das Debuggen von
	 * Streams und Debuggen ist notwendig, vorallem bei längeren und komplizierteren Streams.
	 * <p>
	 * Abhilfe schafft die Intermediate Operation <code>peek()</code>
	 */
	public void debuggingStreams() {
		Stream.of("Max", "Ralph", "Max", "Karl")
				.peek(i -> System.out.println("Element: " + i))
				.distinct()
				.peek(i -> System.out.println("Element: " + i))
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}

}
