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
