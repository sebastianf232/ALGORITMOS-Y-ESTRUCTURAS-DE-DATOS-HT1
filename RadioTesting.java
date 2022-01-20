import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class RadioTesting {
	RadioG9 radio = new RadioG9();

	@Test
	/**
	 * Comprobar en qu� estaci�n
	 * se encuentra el radio 
	 */
	void nextStation() {
		RadioTesting test = new RadioTesting();
		assertEquals(radio.getStation(),530);
	}
	
	@Test
	/**
	 * Comprobar en qu� frecuencia
	 * se encuentra el radio
	 */
	void nextFrequency() {
		assertEquals(radio.getFrequency(),true);
	}
	
	
	

}
