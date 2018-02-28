package at.schrogl.playground.java8.defaultMethods;

/**
 * Dieses Interface verwendet Default-Methoden.
 */
public interface InterfaceWithDefaultMethods1 {

	/** Jede Interface-Methode ist <code>public abstract</code> */
	void ordinaryAbstractMethod();

	/**
	 * Das Schlüsselwort <code>default</code> hat nun seit Java 8 eine Bedeutung.
	 * Auch diese Methode ist natürlich <code>public</code>-sichtbar.
	 */
	default void methodWithDefaultImplementation() {
		// do something
	}

	/** Eine weitere Default-Methode. */
	default void anotherMethodeWithDefaultImplementation() {
		// do something
	}

	/** Statische Methoden in Interfaces sind jetzt auch möglich! */
	static void staticInterfaceMethode() {
		// do something
	}

}
