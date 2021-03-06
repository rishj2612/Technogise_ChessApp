package test.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.utils.Constants;

public class ConstantsTest {

	@Test
	public void testXCoordinateValues() {
		assertEquals(Constants.MAX_X_COORDINATE_VAL, 8);
		assertEquals(Constants.MIN_X_COORDINATE_VAL, 1);
	}

	@Test
	public void testYCoordinateValues() {
		assertEquals(Constants.MAX_Y_COORDINATE_VAL, 72);
		assertEquals(Constants.MIN_Y_COORDINATE_VAL, 65);
	}

}
