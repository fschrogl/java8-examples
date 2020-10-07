package at.schrogl.playground.java8.defaultMethods;

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

/**
 * Dieses Interface verwendet Default-Methoden.
 */
public interface InterfaceWithDefaultMethods2 {

	/**
	 * Das Schlüsselwort <code>default</code> hat nun seit Java 8 eine Bedeutung.
	 * Auch diese Methode ist natürlich <code>public</code>-sichtbar.
	 */
	default void methodWithDefaultImplementation() {
		// do something
	}

	/** Eine weitere Default-Methode. */
	default void anotherMethodeWithDefaultImplementation() {
		// do something
	}

}
