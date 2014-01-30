import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;


public class ChameleonKid extends ChameleonCritter{

	// public ArrayList<Actor> getActors() {
	// 	ArrayList<Actor> a = new ArrayList<Actor>();
	// 	int[] directions = {Location.AHEAD, (Location.AHEAD + 180)};

	// 	for (Location loc : getLocationsInDirections(directions)) {
	// 		Actor kid = getGrid().get(loc);
	// 		a.add(kid);

	// 	}
	// 	return a;
		

	// }
	// public ArrayList<Location> getLocationsInDirections(int[] directions){
		
	// }

	// public void makeMove(Location loc){

	//     setDirection(getLocation().getDirectionToward(loc));

	//     super.makeMove(loc);
	// }
	// 
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> neighbors = super.getActors();
		ArrayList<Actor> actors = new ArrayList<Actor>();

		ArrayList<Location> locs = new ArrayList<Location>();
		locs.add(getLocation().getAdjacentLocation(getDirection()));
		locs.add(getLocation().getAdjacentLocation(getDirection() + 180));

		for (Actor n : neighbors) {
			for (Location loc : locs) {
				if (n.getLocation().equals(loc)) {
					actors.add(n);
					continue;
				}
			}
		}
		return actors;
	}
}