import info.gridworld.actor.Bug;
public class DancingBug extends Bug {

	private int sideLength, steps;
	private int[] array = {1,2,3,4,5};

	public DancingBug(int length){

	}
	public void act() {
	
	  if (canMove()) {
	  	for (int i=0; i<array.length; i++) {
	  		for (int a=0; a<array[i]; a++) {
	  			turn();
	  		}
	  		move();
	  	}
	  	
	  }
	}
}