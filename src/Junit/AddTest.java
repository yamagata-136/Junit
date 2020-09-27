package Junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Add ad = new Add();
		assertEquals(ad.add(1,3), 4);
	}

}
