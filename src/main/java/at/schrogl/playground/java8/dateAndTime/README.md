# Java 8 Daten and Time

Eine neue Date and Time API (JSR-310) wurde auch in Java 8 eingebracht.

Die Idee stammt von JodaTime und ist mittlerweile der dritte Versuch eine sinnvolle Date and Time API in Java zur
Verfügung zu stellen. Versuch 1 war ``java.util.Date``, Versuch 2 war ``java.util.Calendar`` und Versuch 3
ist nun JSR-310.

## Probleme mit Date und Calendar

* Date ist umständlich zu bedienen und bietet nur eine rudimentäre Abstraktion von "Millis since Epoch".
  Zusätzlich sind sehr viele Methoden von Date mittlerweile ``deprecated``
* Calendar bietet eine bessere API als Date, allerdings wird Calendar schnell mühsam, wenn man nur mit einem
  Datum rechnen will und sich nicht für die Uhrzeit interessiert
* Die Klassen der alten Date API sind *mutable* und daher für Multi-threading schlecht geeignet
* man kann Calendar-Objekte nicht formatiert ausgeben
* etc.

Die neue API wird in ``at.schrogl.playground.java8.dateAndTime.JodaTime`` vorgestellt und verwendet. Das
Konvertieren zwischen der neuen und der alten Date API wird in ``at.schrogl.playground.java8.dateAndTime.LegacyConversion``
behandelt.
