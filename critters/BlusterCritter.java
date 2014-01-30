import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;



public class BlusterCritter extends Critter {
	private double DARKENING_FACTOR;
	private int c;
	private int courage;
	public void BlusterCritter(int c) {
		courage = 3;
		if (c <= courage) {
			lighten();
		}else if (c > courage) {
			darken();
		}
	}

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();

		Location loc = getLocation();
		for (int column = loc.getCol() - 2; column<= (loc.getColumn() + 2); column++) {
			for (int row = loc.getRow() - 2; row <= (loc.getRow() + 2); row++) {
				Location test = new Location(row, column);
				if (test ) {
					
				}
					
				
				Actor a = getGrid().get(test);
				
			}
		}




	}

	


	public void darken(){
		DARKENING_FACTOR = 0.1;
		Color c = getColor();
		int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
		int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
		int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

		setColor(new Color(red, green, blue));
	}

	public void lighten() {
		DARKENING_FACTOR = 0.1;
		Color c = getColor();
		int red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
		int green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
		int blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR));

		setColor(new Color(red, green, blue));
	}
}