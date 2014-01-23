import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;



import java.awt.Color;

public class Jumper extends Bug {

	public Jumper() {
		setColor(Color.RED);
	}

	public Jumper(Color color){
		setColor(color);
	}

	public void act() {
		if (canJump()) {
			moveJump();
		} else {
			turn();
		}
	}

	public void turn(){
	    setDirection(getDirection() + Location.HALF_RIGHT);
	}

	public boolean canJump(){
	    Grid<Actor> gr = getGrid();
	    if (gr == null)
	        return false;
	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection());
	    Location next2 = next.getAdjacentLocation(getDirection());
	    if (!gr.isValid(next2))
	        return false;

	    Actor neighbor = gr.get(next);
	    return (neighbor == null) || (neighbor instanceof Flower);
	    // ok to move into empty location or onto flower
	    // not ok to move onto any other actor
	}

	public void moveJump(){
	    Grid<Actor> gr = getGrid();
	    if (gr == null) 
	        return;
	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection());
	    Location next2 = next.getAdjacentLocation(getDirection());
	    if (gr.isValid(next))
	        moveTo(next2);
	    else
	        removeSelfFromGrid();
	    
	    
	}

}