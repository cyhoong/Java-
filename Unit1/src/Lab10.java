import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab10 {
    public static void main(String[] args) {
        Object[] World = { "maze1", "maze2", "maze3" };
        Object filename = JOptionPane.showInputDialog( null, "What robot world?", "Robot World", JOptionPane.QUESTION_MESSAGE, null, World, World[0]);
        Display.openWorld("maps/"+filename+".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        Athelete davy = new Athelete(1,1,Display.NORTH,Display.INFINITY);

        while(!davy.nextToABeeper()){
            if(davy.rightIsClear()){
                davy.turnRight();
                davy.move();
            }
            else if(davy.frontIsClear()){
                davy.move();
            }
            else{
                davy.turnLeft();
            }
        }

    }

}
