import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;



public class BlusterCritter extends Critter {
	private double DARKENING_FACTOR;
	private int c;
	private int courage;
	public BlusterCritter(int c) {
		super();
		courage = 3;
		this.c = c;

		if (c <= courage) {
			lighten();
		}
		if (c > courage) {
			darken();
		}
	}

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location loc = getLocation();
		for (int column = loc.getCol() - 2; column<= (loc.getCol() + 2); column++) {
			for (int row = loc.getRow() - 2; row <= (loc.getRow() + 2); row++) {
				Location test = new Location(row, column);
				if (getGrid().isValid(test) && getGrid() != null) {
					Actor a = this.getGrid().get(test);
					if (a != null && a != this) {
						actors.add(a);
					}	
					
				}				
			}
		}
		return actors;
	}

	public void processActors(ArrayList<Actor> actors) {
		int courage = 1;
		int neighbors = 0;

		System.out.println(neighbors);
		System.out.println(" ");
		System.out.println(courage);

		for (Actor a : actors ) {
			if (a instanceof Critter) {
				neighbors++;
			}			
		}
		if (neighbors < courage) {
			lighten();
		}else {
			darken();
		}
		
		
	}


	public void darken(){
		DARKENING_FACTOR = 0.05;
		Color c = getColor();
		int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
		int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
		int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

		setColor(new Color(red, green, blue));
	}

	public void lighten() {
		Color c = getColor();

		int red = c.getRed();
		int blue = c.getBlue();
		int green = c.getGreen();

		

		if (red < 205) {
			red+=50;
		}
		if (blue < 205) {
			blue+=50;
		}
		if (green < 205) {
			green+=50;
		}


		setColor(new Color(red, green, blue));
	}
}