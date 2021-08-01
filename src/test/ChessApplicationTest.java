/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ChessApplication;
import main.utils.Constants;

/**
 * @author rishabh
 *
 */
class ChessApplicationTest {
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final PrintStream originalOutputStream = System.out;
	private final InputStream sysInBackup = System.in;

	@BeforeEach
	void setUpBeforeClass() {
		System.setOut(new PrintStream(outputContent));
	}

	@AfterEach
	void cleanUpAfterClass() {
		System.setOut(originalOutputStream);
		System.setIn(sysInBackup);
	}

	@Test
	void testPeiceDetailsNotCorrect() {
		ByteArrayInputStream in = new ByteArrayInputStream("\"".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + Constants.PLEASE_PROVICE_CORRECT_PEICE_DETAILS + "\r\n",
				outputContent.toString());
	}

	@Test
	void testForInvalidPeice() {
		ByteArrayInputStream in = new ByteArrayInputStream("unknown H5".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice unknown entered is invalid.\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationXMin() {
		ByteArrayInputStream in = new ByteArrayInputStream("King H0".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice location H0 entered is invalid\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationXMax() {
		ByteArrayInputStream in = new ByteArrayInputStream("King H9".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice location H9 entered is invalid\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMin() {
		ByteArrayInputStream in = new ByteArrayInputStream("King z1".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice location z1 entered is invalid\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMax() {
		ByteArrayInputStream in = new ByteArrayInputStream("King Z1".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice location Z1 entered is invalid\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMinXMin() {
		ByteArrayInputStream in = new ByteArrayInputStream("King z0".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice location z0 entered is invalid\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForInvalidLocationYMaxXMax() {
		ByteArrayInputStream in = new ByteArrayInputStream("King Z9".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "Peice location Z9 entered is invalid\r\n",
				outputContent.toString());
	}

	@Test
	void testKingForHappyPath() {
		ByteArrayInputStream in = new ByteArrayInputStream("King H5".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "[H6, G6, G5, G4, H4]\r\n", outputContent.toString());
	}

	@Test
	void testHorseForHappyPath() {
		ByteArrayInputStream in = new ByteArrayInputStream("Horse H5".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "[G7, F6, F4, G3]\r\n", outputContent.toString());
	}

	@Test
	void testPawnForHappyPath() {
		ByteArrayInputStream in = new ByteArrayInputStream("Pawn E5".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "[F5]\r\n", outputContent.toString());
	}

	@Test
	void testPawnForEdgeCase() {
		ByteArrayInputStream in = new ByteArrayInputStream("Pawn H5".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n" + "[]\r\n", outputContent.toString());
	}

	@Test
	void testRookForHappyPath() {
		ByteArrayInputStream in = new ByteArrayInputStream("Rook E5".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(
				Constants.ENTER_PEICE_DETAILS + "\r\n" + "[F5, G5, H5, D5, C5, B5, A5, E4, E3, E2, E1, E6, E7, E8]\r\n",
				outputContent.toString());
	}

	@Test
	void testBishopForHappyPath() {
		ByteArrayInputStream in = new ByteArrayInputStream("Bishop D4".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(
				Constants.ENTER_PEICE_DETAILS + "\r\n" + "[C3, B2, A1, C5, B6, A7, E3, F2, G1, E5, F6, G7, H8]\r\n",
				outputContent.toString());
	}

	@Test
	void testQueenForHappyPath() {
		ByteArrayInputStream in = new ByteArrayInputStream("Queen D4".getBytes());
		System.setIn(in);
		ChessApplication.main(new String[] {});
		assertEquals(Constants.ENTER_PEICE_DETAILS + "\r\n"
				+ "[E4, F4, G4, H4, C4, B4, A4, D3, D2, D1, D5, D6, D7, D8, C3, B2, A1, C5, B6, A7, E3, F2, G1, E5, F6, G7, H8]\r\n",
				outputContent.toString());
	}

}
