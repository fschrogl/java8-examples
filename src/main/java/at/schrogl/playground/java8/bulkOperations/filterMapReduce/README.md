# Java 8 Filter-Map-Reduce

Die Filter-Map-Reduce-Funktionalität ist eine spezielle Untermenge der Streams API.

Das Filter-Map-Reduce-Framework gibt es bereits seit Java 7, mit Java 8 wurde es jedoch verbessert, indem es für die
neuen Sprachfeatures fit gemacht wurde. Eine Filter-Map-Reduce Operation besteht aus 3 Schritten, ähnlich wie ein
Stream:

1. filter [=Intermediate]
2. map [=Intermediate]
3. redurce [=terminal]

Für ein simples Beispiel siehe ``at.schrogl.playground.java8.bulkOperations.filterMapReduce.FilterMapReduce``
