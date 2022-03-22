package forTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ForTestTest {

	@Test
	void getStringA(){
		ForTest forTest = new ForTest();
		assertEquals(forTest.getString(), "A");
	}
	@Test
	void getStringB(){
		ForTest forTest = new ForTest();
		assertEquals(forTest.getString(), "B");
	}

}
