import javax.swing.JOptionPane;
import edu.fcps.karel2.Display;

public class Lab09 {
    public static void main(String[] args) {
        Object[] World = { "pile1", "pile2", "pile3" };
        Object filename = JOptionPane.showInputDialog( null, "What robot world?", "Robot World", JOptionPane.QUESTION_MESSAGE, null, World, World[0]);
        Display.openWorld("maps/"+filename+".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        Athelete lisa = new Athelete(1,1,Display.EAST,0);

        int[] count = new int[9];
        for (int i = 0; i < count.length; i++) {
            
            while(lisa.nextToABeeper()){
                lisa.pickBeeper();
                count[i]++;
            }
            if (i > 0) {
                for (int j = 0; j < count[i-1]; j++) {
                lisa.putBeeper();
                }
            }
            lisa.move();
        }
        lisa.turnAround();
        for(int i = 0 ; i < count.length; i++){
            lisa.move();
        }
    }
}
