package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import main.ChessBoard;
import main.PeiceCreator;
import main.exceptions.InvalidPeiceException;
import main.peices.King;
import main.utils.Constants;

public class ChessBoardTest {
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final PrintStream originalOutputStream = System.out;
	ChessBoard chessBoard;
	PeiceCreator peiceCreator;

	@BeforeEach
	public void setup() {
		System.setOut(new PrintStream(outputContent));
		chessBoard = new ChessBoard();
		peiceCreator = Mockito.mock(PeiceCreator.class);
		chessBoard.setPeiceCreator(peiceCreator);
	}

	@AfterEach
	public void cleanUp() {
		System.setOut(originalOutputStream);
	}

	@Test
	public void testGetPossibleMovesForKing() throws InvalidPeiceException {
		King king = Mockito.mock(King.class);
		ArrayList<String> possibleMoves = new ArrayList<>();
		when(king.generatePossibleCoordinates(1, 72)).thenReturn(possibleMoves);
		when(peiceCreator.createPeice("King")).thenReturn(king);
		chessBoard.getPossibleCoordinates("King H5");
		String actualOutput = outputContent.toString();
		assertEquals(possibleMoves.toString() + "\r\n", actualOutput);
	}

	@Test
	public void testGetPossibleMovesWhenPeiceLocationIsInvalid() throws InvalidPeiceException {
		King king = Mockito.mock(King.class);
		when(peiceCreator.createPeice("King")).thenReturn(king);
		chessBoard.getPossibleCoordinates("King #4");
		String actualOutput = outputContent.toString();
		assertEquals("Peice location #4 entered is invalid" + "\r\n", actualOutput);
	}

	@Test
	public void testGetPossibleMovesWhenPeiceLocationIsNotProvided() throws InvalidPeiceException {
		King king = Mockito.mock(King.class);
		when(peiceCreator.createPeice("King")).thenReturn(king);
		chessBoard.getPossibleCoordinates("King");
		String actualOutput = outputContent.toString();
		assertEquals(Constants.PLEASE_PROVICE_CORRECT_PEICE_DETAILS + "\r\n", actualOutput);
	}

	@Test
	public void testGetPossibleMovesWhenPeiceXCoordinateIsNotNum() throws InvalidPeiceException {
		King king = Mockito.mock(King.class);
		when(peiceCreator.createPeice("King")).thenReturn(king);
		chessBoard.getPossibleCoordinates("King G%");
		String actualOutput = outputContent.toString();
		assertEquals("Please provide command line arguments as \"Peicename PeiceLocation\" example: King H5." + "\r\n",
				actualOutput);
	}

	@Test
	public void testGetPossibleMovesWhenPeiceTypeIsInvalid() throws InvalidPeiceException {
		peiceCreator = new PeiceCreator();
		chessBoard.setPeiceCreator(peiceCreator);
		chessBoard.getPossibleCoordinates("InvalidPeice G%");
		String actualOutput = outputContent.toString();
		assertEquals("Peice InvalidPeice entered is invalid.\r\n", actualOutput);
	}
}
