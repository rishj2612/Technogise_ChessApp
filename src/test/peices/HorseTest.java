package test.peices;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.peices.Horse;

public class HorseTest {

	private Horse horse;

	@BeforeEach
	public void setup() {
		horse = new Horse();
	}

	@Test
	public void testGetPossibleCoordinates() {
		int xCoordinate = 2;
		int yCoordinate = 66;
		ArrayList<String> possibleCoordinatesActual = horse.generatePossibleCoordinates(xCoordinate, yCoordinate);
		List<String> possibleCoordinatesExpected = (List<String>) Arrays
				.asList(new String[] { "D3", "C4", "A4", "D1" });
		assertEquals(possibleCoordinatesExpected, possibleCoordinatesActual);
	}

}
