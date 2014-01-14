import info.gridworld.actor.Bug;
public class ZBug extends Bug {

	private int sideLength, steps, a;

	public ZBug(int length){
		turn();
		turn();
		steps = 0;
		sideLength = length;

	}
	public void act() {
		
		
	    if (steps < sideLength && canMove() && a <= 2) {
	    	
	        move();
	        steps++;

	    }else{
	    	if (a == 0) {
	    		turn();
	    		turn();
	    		turn();
	    		a = 1;
	    		steps = 0;
	    }else if(a == 1) {
	    		turn();
	    		turn();
	    		turn();
	    		turn();
	    		turn();
	    		a++;
	    		steps = 0;
	    	}
	        
	    }
	}
}