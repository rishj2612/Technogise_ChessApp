package main.peices;

import java.util.ArrayList;

public interface Peice {

	// returns list of possible coordinate based on calling type and input
	// coordinates.
	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate);

}
