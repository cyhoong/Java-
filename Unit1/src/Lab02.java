import edu.fcps.karel2.Display;

public class Lab02 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("maps/maze.map");
		Athelete arron = new Athelete();

        arron.putAndMove();
        arron.turnRight();
        arron.putAndMove();
        arron.turnRight();
        arron.putAndMove();
        arron.turnLeft();
        arron.putAndMove();
        arron.turnLeft();
        arron.putAndMove();
        arron.turnRight();
        arron.putAndMove();
        arron.putAndMove();
        arron.turnRight();
        arron.putAndMove();
        arron.turnLeft();
        arron.putAndMove();
        arron.turnLeft();
        arron.putAndMove();
        arron.putAndMove();
        arron.putAndMove();
        arron.putAndMove();
        arron.turnRight();
        arron.putAndMove();
        arron.putAndMove();

    }

}
