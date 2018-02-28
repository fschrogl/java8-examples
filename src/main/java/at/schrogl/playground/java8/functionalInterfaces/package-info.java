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
