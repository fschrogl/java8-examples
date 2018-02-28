package at.schrogl.playground.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In der Klasse wird das Sortieren von Werten mit Java 7 und Java 8 Features gegenüber gestellt.
 */
public class HelloJava8 {

	/** Die Namen sollen nach ihrer Länge sortiert werden. */
	static final List<String> names = Arrays.asList("Andy", "Michael", "Max", "Stefan");

	public static class Java7Sort {

		public static void main(String[] args) {
			// Sortieren der Namen mittels anonymen Comparators
			Collections.sort(names, new Comparator<String>() {

				@Override
				public int compare(String str1, String str2) {
					return Integer.compare(str1.length(), str2.length());
				}
			});

			// Ausgabe der sortierten Werte (mit unnötigem "," am Schluss)
			for (String name : names) {
				System.out.println(name.length() + ", ");
			}

		}
	}

	static class Java8Sort {

		public static void main(String[] args) {
			names.stream()
					.sorted((s1, s2) -> (Integer.compare(s1.length(), s2.length())))
					.map(name -> String.valueOf(name.length()))
					.collect(Collectors.joining(", "));
		}

	}
}
