# Java 8 Lambdas

Lambdas sind das zentrale neue Sprachelement in Java 8.

Ein Lambda ist im Prinzip eine anonyme Methode, dementsprechend besteht sie aus (optionalen) Eingabeparametern
und Anweisungen. Ein Lambda definiert*keinen** expliziten Rückgabewert und auch*keine** Checked Exceptions.

Der Aufbau eines Lambdas ist dabei folgender:

```
( Parameter-Liste ) -> { Ausdruck oder Anweisungen }
```
 
Beim Definieren eines Lambdas kann man alles weglassen, was der Compiler ableiten kann, d.h. man kann Typen und
Rückgabewerte weglassen und sogar die Klammern, wenn es sich um einfache Statements handelt!

Man kann Lambdas verwenden um anonyme innere Klassen zu ersetzen, aber auch als Methodenparameter und als Rückgabe
einer Methode! Das alles wird in [at.schrogl.playground.java8.lambdas.SimpleLambdas](SimpleLambdas.java) vorgeführt.

Da Lambdas nichts anderes als anonyme Methoden sind ist es auch sinnvoll Methodenreferenzen einzuführen. Dies kann
u.A. die Lesbarkeit des Codes erhöhen. Aufbau einer Methodenreferenz ist wie folgt:

```
Methode: 	Object::methodname
Constructor:	Object::new
```
 
Methodenreferenzen haben gegenüber reinen Lambdas den Nachteil, dass man nicht mehrere Anweisungen verketten kann.
Bei Lambdas kann man diese mittels Semikolon verketten, bei Methodenreferenzen geht dies nicht. Dafür müsste man
sich eine eigene Methoden schreiben und diese dann referenzieren.

## Nachteile der funktionalen Programmierung

* **Komplexe Fehlermeldungen:** Lambdas, vor allem in Zusammenspiel mit der Stream API, können zu sehr komplexen
  Fehlermeldungen führen
  
* **Neues Denken:** Funktionale Programmierung erfordert ein neues Denken beim Lösen von Problemen. "Alte" imperative
  Algorithmen 1:1 in Streams zu übersetzen ist wenig sinnvoll
