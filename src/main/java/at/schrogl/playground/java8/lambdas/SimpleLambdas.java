package at.schrogl.playground.java8.lambdas;

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

import at.schrogl.playground.java8.functionalInterfaces.FunctionalInterface1;

/**
 * Ein Lambda ist eine anonyme Methode.
 * <p>
 * Ein Lambda muss auf die SAM eines Functional Interfaces mappbar sein. Es kann verwendet werden um
 * anonyme innere Klassen zu ersetzen, als Methodenparameter oder als Rückgabe einer Methode. 
 */
public class SimpleLambdas {

	static final List<String> names = Arrays.asList("Andy", "Michael", "Max");
	
	public static void main(String[] args) {		
		
		/**
		 * Vor Java 8 konnte <b>jede</b> Java-Referenz dem Typ <code>Object</code> zugewiesen werden.
		 * Mit Lambdas ist dies <b>nicht</b> mehr möglich. Lambdas können <b>nur</b> Functional
		 * Interfaces zugewiesen werden. Sie müssen auf die SAM des Interfaces gemapped werden können!
		 * <p>
		 * Ersetzt anonyme innere Klasse.
		 */
		FunctionalInterface1 var = () -> { System.out.println("Test"); };
		var.run();
		
		/**
		 * Lambdas als Methodenparameter 
		 */
		Collections.sort(names, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
		
		/**
		 * Lambdas als Rückgabe einer Methode
		 */
		Collections.sort(names, compareByLength());
	}
	
	public static Comparator<String> compareByLength() {
		return (str1, str2) -> Integer.compare(str1.length(), str2.length());
	}
}
