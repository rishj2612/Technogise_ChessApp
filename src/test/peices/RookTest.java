package test.peices;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.peices.Rook;

public class RookTest {

	private Rook rook;

	@BeforeEach
	public void setup() {
		rook = new Rook();
	}

	@Test
	public void testGetPossibleCoordinates() {
		int xCoordinate = 2;
		int yCoordinate = 66;
		ArrayList<String> possibleCoordinatesActual = rook.generatePossibleCoordinates(xCoordinate, yCoordinate);
		List<String> possibleCoordinatesExpected = (List<String>) Arrays.asList(
				new String[] { "C2", "D2", "E2", "F2", "G2", "H2", "A2", "B1", "B3", "B4", "B5", "B6", "B7", "B8" });
		assertEquals(possibleCoordinatesExpected, possibleCoordinatesActual);
	}

}
