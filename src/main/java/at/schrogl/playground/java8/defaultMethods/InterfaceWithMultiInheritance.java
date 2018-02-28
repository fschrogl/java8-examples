package at.schrogl.playground.java8.defaultMethods;

/**
 * Dieses Interface erbt idente Default-Methoden aus verschiedenen Super-Interfaces und muss deshalb eine eigene Implementierung vorgeben.
 */
public interface InterfaceWithMultiInheritance extends InterfaceWithDefaultMethods1, InterfaceWithDefaultMethods2 {

	/** Überschreibt die geerbe Default-Methode mit einer eigenen Implementierung */
	@Override
	default void methodWithDefaultImplementation() {
		// do something
	}

	/** Überrscheibt die geerbte Default-Methode und ruft explizit ein vererbtes Default-Verhalten auf */
	@Override
	default void anotherMethodeWithDefaultImplementation() {
		InterfaceWithDefaultMethods1.super.anotherMethodeWithDefaultImplementation();
	}

}
