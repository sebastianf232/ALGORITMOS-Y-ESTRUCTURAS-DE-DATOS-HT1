import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class RadioTesting {
	RadioG9 radio = new RadioG9();
	@Test
	void nextStation() {
		RadioTesting test = new RadioTesting();
		assertEquals(radio.getStation(),530);
	}
	
	

}
