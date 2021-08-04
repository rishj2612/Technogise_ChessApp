package test.peices;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.peices.Bishop;

public class BishopTest {

	private Bishop bishop;

	@BeforeEach
	public void setup() {
		bishop = new Bishop();
	}

	@Test
	public void testGetPossibleCoordinates() {
		int xCoordinate = 2;
		int yCoordinate = 66;
		ArrayList<String> possibleCoordinatesActual = bishop.generatePossibleCoordinates(xCoordinate, yCoordinate);
		List<String> possibleCoordinatesExpected = (List<String>) Arrays
				.asList(new String[] { "A1", "A3", "C1", "C3", "D4", "E5", "F6", "G7", "H8" });
		assertEquals(possibleCoordinatesExpected, possibleCoordinatesActual);
	}

}
