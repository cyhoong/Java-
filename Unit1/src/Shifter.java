	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
      public void workCorner() {
         
      }
      
      public void moveOneBlock() {
         
      }
      
      public void turnToTheRight() {
         
      }
      
      public void turnToTheNorth() {
         
      }
      
      public void run() {
         int[] count = new int[9];
         for (int i = 0; i < count.length; i++) {
            
            while(nextToABeeper()){
                pickBeeper();
                count[i]++;
            }
            if (i > 0) {
                for (int j = 0; j < count[i-1]; j++) {
                putBeeper();
                }
            }
            move();
         }
      }
   }