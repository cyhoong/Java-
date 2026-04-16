import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Dancer1 extends Dancer {

    public Dancer1() {
        super(1, 1, Display.EAST, 0);
    }
    public Dancer1(int x, int y, int dir, int beeps) {
        super(x, y, dir, beeps);
    }

    public void danceStep() {
        turnRight();
        move();
    }

}
