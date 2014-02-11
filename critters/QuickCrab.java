import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid grid = getGrid();
		int direction = getDirection();
		int left = direction - 90;
		int right = direction + 90;

		checkTwo(locs, left);
		checkTwo(locs, right);

		return locs;

	}
		public void checkTwo(ArrayList<Location> locs, int direction) {
			

			Grid grid = getGrid();
			Location original = getLocation();
			Location temp = original.getAdjacentLocation(direction);
			if (grid.isValid(temp) && grid.get(temp)== null) {
			Location temp2 = temp.getAdjacentLocation(direction);
			if (grid.isValid(temp2) && grid.get(temp2) == null) {
				locs.add(temp2);
			}
			}
		}

		
}