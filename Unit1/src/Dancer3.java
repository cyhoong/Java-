import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Dancer3 extends Dancer {

    public Dancer3() {
        super(1, 1, Display.EAST, 0);
    }
    public Dancer3(int x, int y, int dir, int beeps) {
        super(x, y, dir, beeps);
    }

    public void danceStep() {
        turnAround();
        move();
        move();
        turnRight();
    }

}
