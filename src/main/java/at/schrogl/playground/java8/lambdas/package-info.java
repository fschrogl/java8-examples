/**
 * Lambdas sind das zentrale neue Sprachelement in Java 8.
 * <p>
 * Ein Lambda ist im Prinzip eine anonyme Methode, dementsprechend besteht sie aus (optionalen) Eingabeparametern
 * und Anweisungen. Ein Lambda definiert <b>keinen</b> expliziten Rückgabewert und auch <b>keine</b> Checked
 * Exceptions.
 * <p>
 * Der Aufbau eines Lambdas ist dabei folgender:
 * 
 * <pre>
 *  ( Parameter-Liste ) -&gt; { Ausdruck oder Anweisungen }
 * </pre>
 * 
 * Beim Definieren eines Lambdas kann man alles weglassen, was der Compiler ableiten kann,
 * d.h. man kann Typen und Rückgabewerte weglassen und sogar die Klammern, wenn es sich um
 * einfache Statements handelt!
 * <p>
 * Man kann Lambdas verwenden um anonyme innere Klassen zu ersetzen, aber auch als Methodenparameter und
 * als Rückgabe einer Methode! Das alles wird in {@link at.schrogl.playground.java8.lambdas.SimpleLambdas}
 * vorgeführt.
 * <p>
 * Da Lambdas nichts anderes als anonyme Methoden sind ist es auch sinnvoll Methodenreferenzen einzuführen.
 * Dies kann u.A. die Lesbarkeit des Codes erhöhen. Aufbau einer Methodenreferenz ist wie folgt:
 * 
 * <pre>
 * Methode: 	Object::methodname
 * Constructor:	Object::new
 * </pre>
 * 
 * Methodenreferenzen haben gegenüber reinen Lambdas den Nachteil, dass man nicht mehrere Anweisungen verketten kann. Bei Lambdas kann man diese
 * mittels Semikolon verketten, bei Methodenreferenzen geht dies nicht. Dafür müsste man sich eine eigene Methoden schreiben und diese dann
 * referenzieren.
 * <p>
 * <b>Nachteile der funktionalen Programmierung</b>
 * <ul>
 * <li>Komplexe Fehlermeldungen - Lambdas, vorallem in Zusammenspiel mit der Stream API, können zu sehr komplexen Fehlermeldungen führen
 * <li>Neues Denken - Funktionale Programmierung erfordert ein neues Denken beim Lösen von Problemen. "Alte" imperative Algorithmen 1:1 in
 * Streams zu übersetzen ist wenig sinnvoll
 * </ul>
 */
package at.schrogl.playground.java8.lambdas;
