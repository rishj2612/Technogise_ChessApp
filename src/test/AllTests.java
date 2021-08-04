package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.peices.BishopTest;
import test.peices.HorseTest;
import test.peices.KingTest;
import test.peices.PawnTest;
import test.peices.QueenTest;
import test.peices.RookTest;
import test.util.ConstantsTest;

@RunWith(Suite.class)
@SuiteClasses({ KingTest.class, ConstantsTest.class, HorseTest.class, BishopTest.class, PawnTest.class, QueenTest.class,
		RookTest.class, ChessBoardTest.class, ChessApplicationTest.class, PeiceCreatorTest.class })
public class AllTests {

}
