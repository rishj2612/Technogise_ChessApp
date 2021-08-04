package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.PeiceCreator;
import main.exceptions.InvalidPeiceException;
import main.peices.Bishop;
import main.peices.Horse;
import main.peices.King;
import main.peices.Pawn;
import main.peices.Peice;
import main.peices.Queen;
import main.peices.Rook;

public class PeiceCreatorTest {

	private PeiceCreator peiceCreator;

	@BeforeEach
	public void setup() {
		peiceCreator = new PeiceCreator();
	}

	@Test
	public void testGetPeiceInfoForKing() throws InvalidPeiceException {
		Peice peice = peiceCreator.createPeice("King");
		assertEquals(peice.getClass(), King.class);
	}

	@Test
	public void testGetPeiceInfoForBishop() throws InvalidPeiceException {
		Peice peice = peiceCreator.createPeice("Bishop");
		assertEquals(peice.getClass(), Bishop.class);
	}

	@Test
	public void testGetPeiceInfoForHorse() throws InvalidPeiceException {
		Peice peice = peiceCreator.createPeice("Horse");
		assertEquals(peice.getClass(), Horse.class);
	}

	@Test
	public void testGetPeiceInfoForPawn() throws InvalidPeiceException {
		Peice peice = peiceCreator.createPeice("Pawn");
		assertEquals(peice.getClass(), Pawn.class);
	}

	@Test
	public void testGetPeiceInfoForQueen() throws InvalidPeiceException {
		Peice peice = peiceCreator.createPeice("Queen");
		assertEquals(peice.getClass(), Queen.class);
	}

	@Test
	public void testGetPeiceInfoForRook() throws InvalidPeiceException {
		Peice peice = peiceCreator.createPeice("rook");
		assertEquals(peice.getClass(), Rook.class);
	}

	@Test
	public void testGetPeiceInfoForUnknow() throws InvalidPeiceException {
		Throwable exception = assertThrows(InvalidPeiceException.class, () -> peiceCreator.createPeice("unkown"));
		assertEquals(InvalidPeiceException.class, exception.getClass());
	}

}
