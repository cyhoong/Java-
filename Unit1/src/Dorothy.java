import edu.fcps.karel2.Display;

public class Dorothy extends Athelete
{
    public Dorothy()
    {
        super(2, 2, Display.EAST, 0);
    }

    public boolean findPath(){
        int count = 0;

        if (nextToABeeper()) {
            turnLeft();
            return true;
        }
        while (!nextToABeeper()) {
            turnAround();
            move();
            turnAround();
            turnLeft();
            count++;

            if (count == 2) {
                turnLeft();
            }
            else if (count == 3) {
                return false;
            }
            move();
        }
        

        return true;
    }

    public void followPath(){
        while (nextToABeeper() && frontIsClear()) {
            move();
        }
    }

}
