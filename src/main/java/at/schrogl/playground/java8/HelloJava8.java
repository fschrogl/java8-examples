package at.schrogl.playground.java8;

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
