/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ChessApplication;

/**
 * @author rishabh
 *
 */
class ChessApplicationTest {
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final PrintStream originalOutputStream = System.out;

	@BeforeEach
	void setUpBeforeClass() {
		System.setOut(new PrintStream(outputContent));
	}

	@AfterEach
	void cleanUpAfterClass() {
		System.setOut(originalOutputStream);
	}

	@Test
	void testForInvalidPeice() {
		ChessApplication.main(new String[] { "unknown H5" });
		assertEquals("Peice unknown entered is invalid.\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationXMin() {
		ChessApplication.main(new String[] { "King H0" });
		assertEquals("Peice location H0 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationXMax() {
		ChessApplication.main(new String[] { "King H9" });
		assertEquals("Peice location H9 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMin() {
		ChessApplication.main(new String[] { "King z0" });
		assertEquals("Peice location z0 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMax() {
		ChessApplication.main(new String[] { "King Z9" });
		assertEquals("Peice location Z9 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForHappyPath() {
		ChessApplication.main(new String[] { "King H5" });
		assertEquals("[H6, G6, G5, G4, H4]\r\n", outputContent.toString());
	}

	@Test
	void testHorseForHappyPath() {
		ChessApplication.main(new String[] { "Horse H5" });
		assertEquals("[G7, F6, F4, G3]\r\n", outputContent.toString());
	}

	@Test
	void testPawnForHappyPath() {
		ChessApplication.main(new String[] { "Pawn E5" });
		assertEquals("[F5]\r\n", outputContent.toString());
	}

}
