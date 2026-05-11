	package Lab08;
   //Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   import Lab06.TurtlePanel;
   public class U2Driver08
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(700, 700);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);

         FlowerTurtle flower1 = new FlowerTurtle(100.0, 45.0, Color.RED);
         FlowerTurtle flower2 = new FlowerTurtle(250.0, 45.0, Color.YELLOW);
         FlowerTurtle flower3 = new FlowerTurtle(400.0, 45.0, Color.BLUE);
         FlowerTurtle flower4 = new FlowerTurtle(550.0, 45.0, Color.BLACK);

         Thread t1 = new Thread(flower1);
         Thread t2 = new Thread(flower2);
         Thread t3 = new Thread(flower3);
         Thread t4 = new Thread(flower4);

         t1.start();
         t2.start();
         t3.start();
         t4.start();
      
      }
   }