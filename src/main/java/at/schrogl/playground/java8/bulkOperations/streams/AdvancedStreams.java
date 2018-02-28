package at.schrogl.playground.java8.bulkOperations.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Fortgeschrittene Verwendund von Streams
 */
@SuppressWarnings("unused")
public class AdvancedStreams {

	/**
	 * Ein Stream wird wie eine Pipeline verarbeitet, d.h. jedes Element des Streams durchläuft die komplette Pipeline, erst dann wird das
	 * nächste Element in die Pipeline geschickt. Außerdem sind Streams zustandslos (Ausnahmen: <code>sort()</code>, <code>distinct()</code>),
	 * d.h. die Elemente werden unabhängig voneinander verarbeitet. Beide Eigenschaften bilden die Grundlage dafür, dass Streams auch
	 * parallelisiert verarbeitet werden können.
	 */
	public void parallelStreams() {
		final String[] namesArray = { "Karl", "Ralph", "Max" };
		final List<String> namesCollection = Arrays.asList(namesArray);

		Stream<String> parallelStreamFromArray = Arrays.stream(namesArray).parallel();
		Stream<String> parallelStreamFromList = namesCollection.parallelStream();

	}

	/**
	 * Die Operationen <code>map(), flatMap()</code> sind dazu eine Operation auf den Elementen eines Streams auszuführen und das jeweilige
	 * Element durch den Rückgabewert der Operation zu ersetzen. Dies ist nicht Typ-gebunden, d.h. man kann die Elemente mit Elementen eines
	 * anderen Typs ersetzen.
	 * <p>
	 * Die Operation <code>map()</code> ist sehr intuitiv, sie mapped ein Element auf ein neues Element. Die Operation <code>flatMap()</code>
	 * ist komplizierter. Mit ihrer Hilfe kann man verschachtelte Streams "entschachteln", also quasi glätten.
	 */
	public void mappingStreams() {
		/* map() ist intuitiv */
		Stream.of("1", "23", "0", "-1")
				.map(i -> Integer.valueOf(i))
				.reduce((x, y) -> (x + y));

		/* flatMap() ist komplizierter */
		List<String> sentences = Arrays.asList("Das ist Satz eins.", "Das ist Satz zwei");
		Stream<Stream<String>> streamOfStreams = sentences.stream().map(line -> Stream.of(line.split(" ")));
		Stream<String> mergedStream = sentences.stream().flatMap(line -> Stream.of(line.split(" ")));
	}

	/**
	 * Es kann natürlich sein, dass die Berechnung eines Streams <code>null</code> zurück liefert, z.B. dann, wenn ein Filter auf nichts matched
	 * und der Stream danach leer ist. Das kann etwas unschön sein, weil man so immer einen komplexen Typ als Ergebnisvariable verwenden (wegen
	 * Autoboxing) und anschließend auf <code>null</code> prüfen muss. Schöner geht das mit dem Java 8 Typen {@link Optional} (und seinen
	 * Subtypen).
	 */
	public void optionalInStreams() {
		OptionalDouble avg = Stream.of("Max", "Ralph", "Anna")
				.filter(name -> name.startsWith("X"))
				.mapToInt(name -> name.length())
				.average();

		System.out.println("Average is: " + avg.orElse(0d));
	}

	/**
	 * Die Terminal Operation <code>collect()</code> bietet vorallem in Zusammenspiel mit der Utilityklasse {@link Collectors} viele hilfreiche
	 * Funktionen.
	 */
	public void playingWithCollectors() {
		List<String> names = Arrays.asList("Stefan", "Ralph", "Andi", "Mike", "Florian", "Michael", "Sebastian");

		/* joined, OHNE Komma nach dem letzen Element! */
		String joined = names.stream().sorted().collect(Collectors.joining(", "));

		/* Gruppiert nach der Namenslänge */
		Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));

		/* Anzahl der Elemente je Gruppe */
		Map<Integer, Long> counting = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));

		/* Partitioniert, d.h auf Basis eines Predicates in 2 Gruppen geteilt */
		Map<Boolean, List<String>> partitions = names.stream().collect(Collectors.partitioningBy(name -> name.length() > 4));

		/* Gruppieren von Elementen mit sich selbst (Vorkommenshäufigkeit) */
		/* (1) mit Function */
		Function<String, String> identity = Function.identity();
		names.stream().collect(Collectors.groupingBy(identity, Collectors.counting()));

		/* (2) mit einfachem Lambda */
		names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
	}

	/**
	 * Per Default sind Streams sequentiell, man kann sich aber auch parallelisieren. Es ist auch problemlos möglich zwischen sequentieller und
	 * paralleler Verarbeitung hin und her zu schalten (allerdings meistens nicht sinnvoll, weil die notwendige Synchronisation macht die zuvor
	 * gewonnene Performance wieder zunichte).
	 * <p>
	 * Möchte man eine sequentielle Ausgabe (Iteration) haben, so muss man <code>forEachOrdered()</code> verwenden!
	 */
	public void parallelAndSequential() {
		List<String> names = Arrays.asList("Stefan", "Ralph", "Andi", "Mike", "Florian", "Michael", "Sebastian");

		names.parallelStream().filter(name -> name.length() > 4)
				.sequential().forEach(System.out::println);

		names.parallelStream().filter(name -> name.length() > 4)
				.forEachOrdered(System.out::println);
	}
}
