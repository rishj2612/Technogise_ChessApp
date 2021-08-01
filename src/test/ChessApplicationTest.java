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
	void testCommandLineArgsNotPresent() {
		ChessApplication.main(new String[] {});
		assertEquals("Please provide command line arguments as \"Peicename PeiceLocation\" example: \"King H5\".\r\n",
				outputContent.toString());
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
		ChessApplication.main(new String[] { "King z1" });
		assertEquals("Peice location z1 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMax() {
		ChessApplication.main(new String[] { "King Z1" });
		assertEquals("Peice location Z1 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMinXMin() {
		ChessApplication.main(new String[] { "King z0" });
		assertEquals("Peice location z0 entered is invalid\r\n", outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMaxXMax() {
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

	@Test
	void testPawnForEdgeCase() {
		ChessApplication.main(new String[] { "Pawn H5" });
		assertEquals("[]\r\n", outputContent.toString());
	}

	@Test
	void testRookForHappyPath() {
		ChessApplication.main(new String[] { "Rook E5" });
		assertEquals("[F5, G5, H5, D5, C5, B5, A5, E4, E3, E2, E1, E6, E7, E8]\r\n", outputContent.toString());
	}

	@Test
	void testBishopForHappyPath() {
		ChessApplication.main(new String[] { "Bishop D4" });
		assertEquals("[C3, B2, A1, C5, B6, A7, E3, F2, G1, E5, F6, G7, H8]\r\n", outputContent.toString());
	}
	
	@Test
	void testQueenForHappyPath() {
		ChessApplication.main(new String[] { "Queen D4" });
		assertEquals("[D3, D2, D1, D5, D6, D7, D8, E4, F4, G4, H4, C4, B4, A4, E3, F2, G1, E5, F6, G7, H8, C3, B2, A1, C5, B6, A7]\r\n", outputContent.toString());
	}

}
