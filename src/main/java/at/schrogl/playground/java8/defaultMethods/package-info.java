/**
 * Default- und statische Methoden für Interfaces.
 * <p>
 * <strong>Default-Methoden in Interfaces</strong>
 * <p>
 * Mit Default-Methoden wird es möglich Default-Implementierungen für Interface-Methoden vorzugeben. Dies war ein zentraler Punkt bei der
 * Einführung von Lambdas ins JDK. Durch Default-Methoden kann man Implementierungen vorgeben und so bestehende Interfaces für die Verwendung
 * mit Lambdas anpassen ohne bestehende Implementierungen/Programme zu zerstören.
 * <p>
 * Im Interface {@link at.schrogl.playground.java8.defaultMethods.InterfaceWithDefaultMethods1} wird die Verwendung von Default-Methoden
 * gezeigt.
 * Mit Default-Methoden ist es jetzt auch möglich Spezial-Implementierungen für einzelne Untertypen vorzugeben, dies geschieht seit JDK 8 z.B.
 * beim Sortieren von {@link java.util.ArrayList}. Des Weiteren kann man Default-Methoden auch verwenden um die Anzahl der Methoden, die man
 * Implementieren muss, wenn man von einem Interface ableitet, zu reduzieren (wird z.B. bie {@link java.util.Iterator#remove()} so gemacht).
 * <p>
 * Mit Default-Methoden hat auch eine Art Mehrfachvererbung in Java Einzug erhalten. Was passiert nun, wenn zwei idente Default-Methoden vererbt
 * werden? Der Entwickler muss entscheiden! Zwei idente Default-Methoden führen zu einem Compile-Error, d.h. der Entwickler muss eine eigene
 * Default-Implementierung für diese Methoden schreiben. Wie dies umgesetzt werden kann wird in
 * {@link at.schrogl.playground.java8.defaultMethods.InterfaceWithMultiInheritance} gezeigt.
 * <p>
 * <strong>Statische Methoden in Interfaces</strong>
 * <p>
 * Neben Default-Methoden können Interfaces nun auch statische Methoden enthalten. Dadurch kann man z.B. Utility-Methoden direkt in Interfaces
 * anbieten. Man sollte sich hierbei aber bewusst sein, dass man so ein Interface verwässert und außerdem evtl. auch "unnötige" Dependencies in
 * ein Interface miteinzieht.
 * <p>
 * <i>Warnung:</i> Default-Methoden verwässern das Konzept von Interfaces und erlauben außerdem laxere Programmierung, weil man so
 * jederzeit neue Methoden zu Interfaces hinzufügen kann. Deshalb sollte man sich selbst bei der Verwendung von Default-Methoden auf die Finger
 * schauen.
 */
package at.schrogl.playground.java8.defaultMethods;
