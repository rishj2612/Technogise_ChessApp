package test.peices;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.peices.King;

public class KingTest {

	private King king;

	@BeforeEach
	public void setup() {
		king = new King();
	}

	@Test
	public void testGetPossibleCoordinates() {
		int xCoordinate = 2;
		int yCoordinate = 66;
		ArrayList<String> possibleCoordinatesActual = king.generatePossibleCoordinates(xCoordinate, yCoordinate);
		List<String> possibleCoordinatesExpected = (List<String>) Arrays
				.asList(new String[] { "C3", "B3", "A3", "A2", "A1", "B1", "C3", "C2" });
		assertEquals(possibleCoordinatesExpected, possibleCoordinatesActual);
	}

}
