package test.peices;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.peices.Pawn;

public class PawnTest {

	private Pawn pawn;

	@BeforeEach
	public void setup() {
		pawn = new Pawn();
	}

	@Test
	public void testGetPossibleCoordinates() {
		int xCoordinate = 2;
		int yCoordinate = 66;
		ArrayList<String> possibleCoordinatesActual = pawn.generatePossibleCoordinates(xCoordinate, yCoordinate);
		List<String> possibleCoordinatesExpected = (List<String>) Arrays.asList(new String[] { "C2" });
		assertEquals(possibleCoordinatesExpected, possibleCoordinatesActual);
	}

	@Test
	public void testGetPossibleCoordinatesForInvalidCoordinate() {
		int xCoordinate = 10;
		int yCoordinate = 66;
		ArrayList<String> possibleCoordinatesActual = pawn.generatePossibleCoordinates(xCoordinate, yCoordinate);
		assertEquals(0, possibleCoordinatesActual.size());
	}

}
