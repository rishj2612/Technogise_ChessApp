/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import main.ChessApplication;

/**
 * @author rishabh
 *
 */
class ChessApplicationTest {
	private final InputStream sysInBackup = System.in;

	@AfterEach
	void cleanUpAfterClass() {
		System.setIn(sysInBackup);
	}

	@Test
	public void getUserInput() {
		ByteArrayInputStream in = new ByteArrayInputStream("King H5".getBytes());
		System.setIn(in);
		String userInput = ChessApplication.getUserInput();
		assertEquals("King H5", userInput);
	}

	@Test
	public void getUserInputForEmptyInput() {
		ByteArrayInputStream in = new ByteArrayInputStream("".getBytes());
		System.setIn(in);
		String userInput = ChessApplication.getUserInput();
		assertEquals("", userInput);
	}

}
