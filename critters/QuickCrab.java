import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>()
		Grid grid = getGrid();
		int direction = getDirection();
		int Left = direction - 90;
		int Right = direction + 90;

		// checkTwo(locs, Left);
		// checkTwo(locs, Right);



	}
		public void checkTwo(ArrayList<Location> locs) {
			
		}

		
}