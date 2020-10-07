/**
 * In diesem Package werden Functional Interfaces vorgestellt.
 * <p>
 * Functional Interfaces gab es bereits vor Java 8, jedoch wurden sie erst durch Lambdas wirklich wichtig.
 * Bei einem Functional Interface handelt es sich um ein Interface mit <b>genau einer</b> Methode, daher
 * werden die Functional Interfaces auch als SAM-Typen (<i>Single Abstract Method</i>) bezeichnet.
 * <p>
 * Beispiel für ein Functional Interface ist {@link at.schrogl.playground.java8.functionalInterfaces.FunctionalInterface1}
 * <p>
 * Ein Functional Interface kann auch <b>mehr als eine Methode</b> haben, wenn es sich um Methoden handelt,
 * die in {@link java.lang.Object} enthalten sind! Ein Beispiel für ein derartiges Functional Interface
 * ist {@link at.schrogl.playground.java8.functionalInterfaces.FunctionalInterface2}.
 * <p>
 * Im JDK 8 wurden viele neue SAM-Interfaces eingeführt, um effektiv mit Lambdas arbeiten zu können. Im Package {@link java.util.function} sind
 * über 40 Functional Interfaces vorhanden, die man für Lambda-Ausdrücke verwenden kann.
 */
package at.schrogl.playground.java8.functionalInterfaces;

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
