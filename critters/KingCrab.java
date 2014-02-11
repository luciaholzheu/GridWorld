import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.*;


import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter{

	// public boolean moveAway(Actor a){

	// 	ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(a.getLocations);


	// 	for (int i = 0; i<= locs.size(); i++) {
	// 		Location loc = getLocation();
	// 		if (distanceFrom(getLocation, loc) > 1) {
	// 			a.makeMove(loc);
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

	public void processActors(ArrayList<Actor> actors){
		for (Actor a : actors){

		    if (!(a instanceof Rock) && !(a instanceof Critter)){
		        a.removeSelfFromGrid();
		    }else{
		    	Grid g = getGrid();
		    	Location loc = a.getLocation().getAdjacentLocation(a.getLocation().getDirectionToward(getLocation()) - 180);
		    	if (loc == null && g.isValid(loc)) {
		    		if (!g.getOccupiedLocations().contains(loc)) {
		    			a.moveTo(loc);
		    		}else{
		    			a.removeSelfFromGrid();
		    		}
		    	}else{
		    		a.removeSelfFromGrid();
		    	}	
		    	
		    }
		}    
	}
	// public int distanceFrom(Location loc1, Location loc2){

	// 	int x1 = loc1.getCol();
	// 	int x2 = loc2.getCol();
	// 	int y1 = loc1.getRow();
	// 	int y2 = loc2.getRow();



	// }


}