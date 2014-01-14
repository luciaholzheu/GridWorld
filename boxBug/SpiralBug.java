import info.gridworld.actor.Bug;
public class SpiralBug extends Bug {

	private int sideLength, steps;

	public SpiralBug(int length){

		steps = 0;
		sideLength = length;

	}
	public void act() {
	    if (steps < sideLength && canMove()) {
	    	
	        move();
	        steps++;
	    }else{

	        turn();
	        turn();
	        sideLength++;
	        steps = 0;
	    }
	}
}