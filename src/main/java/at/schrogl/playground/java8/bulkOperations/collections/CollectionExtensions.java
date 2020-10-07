package at.schrogl.playground.java8.bulkOperations.collections;

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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Das Collections-Framework wurde um zwei Default-Methoden erweitert:
 * <ul>
 * <li>{@link Collection#removeIf(Predicate)}
 * <li>{@link List#replaceAll(java.util.function.UnaryOperator)}
 * </ul>
 * Um mit diesen beiden Methoden arbeiten zu können muss man {@link Predicate} und {@link UnaryOperator} verstehen.
 */
public class CollectionExtensions {

	/**
	 * Das Interface {@link Predicate} ist neu und kann verwendet werden um komfortabel boolsche Ausdrücke zu formulieren. Neben seiner
	 * SAM-Methode {@link Predicate#test(Object)} bietet es noch einige Default-Methoden mit denen man Prädikate logisch verknüpfen kann.
	 */
	public void usingPredicates() {
		// Prädikate formulieren
		final Predicate<String> isNull = str -> str == null;
		final Predicate<String> isEmpty = String::isEmpty;
		final Predicate<String> notNullNotEmpty = isNull.negate().and(isEmpty.negate());

		// Prädikate nutzen
		String testString = "asdf";
		System.out.println("Is null: " + isNull.test(testString));
		System.out.println("Is empty: " + isEmpty.test(testString));
		System.out.println("Is null or empty: " + isNull.or(isEmpty).test(testString));
		System.out.println("Is NOT null and NOT empty: " + isNull.negate().and(isEmpty.negate()).test(testString));
		System.out.println("Is NOT null and NOT empty: " + notNullNotEmpty.test(testString));
	}

	/**
	 * Der {@link UnaryOperator} beschreibt eine Methode mit genau einem Eingabeparameter. Er bildet somit quasi das Basis-Interface für ein
	 * Lambda.
	 */
	public void usingUnaryOperations() {
		// UnaryOperators definieren
		final UnaryOperator<String> markTextWithM = str -> str.startsWith("M") ? ">>" + str + "<<" : str;
		final UnaryOperator<String> trimmer = String::trim;
		final UnaryOperator<String> mapNullToEmpty = str -> str == null ? "" : str;

		// UnaryOperators nutzen
		String testString1 = "Masdf";
		String testString2 = null;

		markTextWithM.apply(testString1);
		mapNullToEmpty.andThen(trimmer).andThen(markTextWithM).apply(testString2);
	}

	/**
	 * Hier werden die neuen Collections-Methoden mit {@link UnaryOperator} verwendet. Performant ist die Vorstellung hier nicht, weil 3-mal
	 * intern iteriert wird.
	 */
	public void combineIt() {
		final List<String> names = Arrays.asList(new String[] { "name1", "  ", null });

		// UnaryOperators definieren
		final UnaryOperator<String> mapNullToEmpty = str -> str == null ? "" : str;

		// Mappe die Nulls, damit keine NPEs
		names.replaceAll(mapNullToEmpty);

		// Alles trimmen
		names.replaceAll(String::trim);

		// Leere Strings entfernen
		names.removeIf(String::isEmpty);
	}

}
