package Lab09;
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
import Lab06.TurtlePanel;

import javax.swing.JFrame;

public class U2Driver09 {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Flower Turtles");
        frame.setSize(400, 400);
        frame.setLocation(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new TurtlePanel());
        frame.setVisible(true);
        Turtle.clear(Color.WHITE);
        
        TwistyTurtle twisty1 = new TwistyTurtle(300.0, 200.0, 5, 400, 10, 123, 1);
        TwistyTurtle twisty2 = new TwistyTurtle(200.0, 200.0, 0, 150, 2, 30, 2);
        TwistyTurtle twisty3 = new TwistyTurtle(400.0, 400.0, 25, 150, 5, 3);

        Thread t1 = new Thread(twisty1);
        Thread t2 = new Thread(twisty2);
        Thread t3 = new Thread(twisty3);

        t1.start();
        t2.start();
        t3.start();
    }


}
