import info.gridworld.actor.Bug;

public class Ant extends Bug {
	
	private int steps;


	public Ant() {
		steps = 0;
	}

	public void act() {
		Location adjLoc = getAdjacentLocation(getDirection());
		if (get(adjLoc) instanceof Flower) {
			remove(adjLoc);
			moveTo(adjLoc);
			turnLeft();
			turnLeft();
		} else {
			put(adjLoc, new Flower());
			moveTo(adjLoc);
			turn();
			turn();
		}
	}

	public void turnLeft() {
		setDirection(getDirection() - 45);
	}
}
