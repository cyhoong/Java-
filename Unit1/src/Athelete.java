import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Athelete extends Robot{

    public Athelete()
    {
        super(1, 1, Display.NORTH, Display.INFINITY);
    }

    public Athelete(int x, int y, int dir, int beep){
        super(x, y, dir, beep);
    }

    public void turnAround(){
        turnLeft();
        turnLeft();
    }

    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void putAndMove(){
        putBeeper();
        move();
    }
}
