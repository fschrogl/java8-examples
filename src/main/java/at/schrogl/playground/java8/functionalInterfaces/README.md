# Java 8 Functional Interfaces

In diesem Package werden Functional Interfaces vorgestellt.

Functional Interfaces gab es bereits vor Java 8, jedoch wurden sie erst durch Lambdas wirklich wichtig.
Bei einem Functional Interface handelt es sich um ein Interface mit **genau einer** Methode, daher
werden die Functional Interfaces auch als SAM-Typen (*Single Abstract Method*) bezeichnet.

Beispiel für ein Functional Interface ist [at.schrogl.playground.java8.functionalInterfaces.FunctionalInterface1](FunctionalInterface1.java)

Ein Functional Interface kann auch **mehr als eine Methode** haben, wenn es sich um Methoden handelt, die in
``java.lang.Object`` enthalten sind! Ein Beispiel für ein derartiges Functional Interface ist 
[at.schrogl.playground.java8.functionalInterfaces.FunctionalInterface2](FunctionalInterface2.java).

Im JDK 8 wurden viele neue SAM-Interfaces eingeführt, um effektiv mit Lambdas arbeiten zu können. Im Package
``java.util.function`` sind über 40 Functional Interfaces vorhanden, die man für Lambda-Ausdrücke verwenden kann.
