/**
 * Die Filter-Map-Reduce-Funktionalität ist eine spezielle Untermenge der Streams API.
 * <p>
 * Das Filter-Map-Reduce-Framework gibt es bereits seit Java 7, mit Java 8 wurde es jedoch verbessert, indem es für die neuen Sprachfeatures fit
 * gemacht wurde. Eine Filter-Map-Reduce Operation besteht aus 3 Schritten, ähnlich wie ein Stream:
 * <ol>
 * <li>filter [=Intermediate]
 * <li>map [=Intermediate]
 * <li>redurce [=terminal]
 * </ol>
 * Für ein simples Beispiel siehe {@link at.schrogl.playground.java8.bulkOperations.filterMapReduce.FilterMapReduce}
 */
package at.schrogl.playground.java8.bulkOperations.filterMapReduce;

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
