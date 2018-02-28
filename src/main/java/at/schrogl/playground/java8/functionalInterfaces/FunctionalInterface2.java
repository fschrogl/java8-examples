package at.schrogl.playground.java8.functionalInterfaces;

/**
 * Ein <code>Functional Interface</code> enthält genau eine Methode. Ausgenommen von dieser Regel
 * sind Methoden, die in {@link Object} vorkommen, diese "zählen" nicht als Lambda-Methoden.
 * <p>
 * Die Annotation des Interfaces mit {@link FunctionalInterface} ist <b>optional</b>, erlaubt
 * dem Compiler aber das Interface auf Konformität zu checken!
 */
@FunctionalInterface
public interface FunctionalInterface2 {

	/** Die SAM des Functional Interfaces */
	void run();
	
	/** Zählt nicht als SAM, weil in {@link Object} vorhanden! */
	boolean equals(Object obj);
	
}
