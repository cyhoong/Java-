import edu.fcps.karel2.Display;

public class Republican extends MazeEscaper
{
   public void walkDownCurrentSegment()
   {
    if (!rightIsClear() && frontIsClear() && !nextToABeeper()){
        move();
        }
      
   }

   public void turnToTheNextSegment()
   {
    if (rightIsClear()) {
        turnRight();
        move();
        }
    else{
        turnLeft();
    }
   }

}
