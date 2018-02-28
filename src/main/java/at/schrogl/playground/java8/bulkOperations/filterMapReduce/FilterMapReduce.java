package at.schrogl.playground.java8.bulkOperations.filterMapReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Filter-Map-Redurce ist nur eine Untermenge der Stream API, d.h. es funktioniert genauso wie ein Stream.
 */
@SuppressWarnings("unused")
public class FilterMapReduce {

	/**
	 * Die Filter-Map-Redurce-Operation sollte selbsterklärend sein. Interessant ist nur die <code>reduce()</code>-Methode. Hierbei handelt es
	 * sich um eine allgemeine Reduce-Operation. Die Stream API bietet spezialisierte Varianten, wie z.B. <code>collect()</code>, welches in
	 * diesem Fall auch besser gewesen wäre.
	 */
	public void filterMapReduce() {
		List<String> names = Arrays.asList("Stefan", "Ralph", "Andi", "Mike", "Florian", "Michael", "Sebastian");

		/* Reduce retourniert ein Optional */
		Optional<String> reduced = names.stream()
				.filter(name -> name.contains("i"))
				.map(String::toUpperCase)
				.reduce((n1, n2) -> (n1 + ", " + n2));

		/* Collect nicht, d.h. man muss auf null/empty String checken */
		String collected = names.stream()
				.filter(name -> name.contains("i"))
				.map(String::toUpperCase)
				.collect(Collectors.joining(", "));
	}

}
