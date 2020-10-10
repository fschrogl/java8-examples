# Java 8 Streams

Streams sind eine "Folge von Verarbeitungsschritten auf Daten".

Ein Stream ist wie eine Pipeline um Daten zu verarbeiten. Er ähnelt in gewisser Weise daher einem Iterator, speichert
jedoch keine Daten und kann nur 1-mal durchlaufen werden! Ein Stream unterstützt 3 Typen von Operationen bzw. wird
folgendermaßen aufgebaut:

```
Create => Intermediate => Terminal
```

Bei "Create" wird der Stream aus einer Quelle erzeugt. Danach folgt "Intermediate", wo beliebig viele Operationen auf
den Stream angewendet werden. Zum Schluss folgt "Terminal" wo das Ergebnis des Streams zurück geliefert wird (Streams
speichern ja keine Daten, d.h. man könnte sonst nachher nicht mehr auf die Daten zugreifen).

Die Unterscheidung in die 3 Operationstypen ist wichtig, um Streams zu verstehen. Streams haben folgende Eigenschaften:

* die Intermediate-Operationen liefern wieder einen Stream zurück, d.h. man kann sie beliebig lang verknüpfen
* die Abarbeitung des Streams wird erst durch die Terminal-Operation gestartet
* nach dem Aufruf einer Terminal-Operation ist der Stream "verbraucht". Weiteres arbeiten auf dem Stream führt zu einer
  ``java.lang.IllegalStateException``
* ein Stream wird wie eine Pipeline verarbeitet, d.h. jedes Element durchläuft die Pipeline komplett bevor das nächste
  angefangen wird

Die grundlegende Verwendung von Streams wird in ``at.schrogl.playground.java8.bulkOperations.streams.BasicStreams``
gezeigt. Fortgeschrittene Themen werden in ``at.schrogl.playground.java8.bulkOperations.streams.AdvancedStreams``
ausprobiert.
