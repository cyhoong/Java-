   //Name:    Date:
   package Lab12;
   import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
      private int hits = 0;
		//constructor   
       public PrizePanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME,FRAME);
         ball = new Ball(50, 50, 30, Color.RED);
         pd = new Polkadot(50, 50, 30, Color.YELLOW);
        
         //Mouse
         addMouseListener(new Mouse());

         //KeyBoard
         addKeyListener(new Key());
         setFocusable(true);

         t = new Timer(5, new Listener());
         t.start();
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);    //cover the 
            myBuffer.fillRect(0,0,FRAME,FRAME);   //old ball
            ball.move(FRAME,FRAME);
            collide(ball, pd);

            ball.draw(myBuffer);
            pd.draw(myBuffer);

            myBuffer.setColor(Color.BLACK);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 150, 25);

            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 12));
            myBuffer.drawString("Use UP DOWN LEFT RIGHT to control ball location", 50, 40);

            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 12));
            myBuffer.drawString("Use 8 5 4 6 to control polkadot location", 50, 55);
            repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(pd.getX(), pd.getY(), b.getX(), b.getY());  
         if(d <= pd.getRadius() + b.getRadius())
         {
            hits++;
            pd.jump(FRAME, FRAME);
         }
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 	 // enter the calculation here.
      }

      private class Mouse extends MouseAdapter {
         public void mouseClicked(MouseEvent e) {
            if (e.isMetaDown()) {
               ball.setX(e.getX());
               ball.setY(e.getY());
            }
            else if (e.isShiftDown()) {
               ball.setdx(Math.random()*12 - 6);
               ball.setdy(Math.random()*12 - 6);
            } else {
               pd.setX(e.getX());
               pd.setY(e.getY());
            }
         }
      
         
      }

      private class Key extends KeyAdapter {
         public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
               ball.setY(ball.getY() - 20);
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
               ball.setY(ball.getY() + 20);
            }
            else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
               ball.setX(ball.getX() - 20);
            }
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
               ball.setX(ball.getX() + 20);
            }

            if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
               pd.setY(pd.getY() - 10);
               if(pd.getY() <= pd.getRadius()) {
                  pd.setY(pd.getDiameter());
               }
            }
            else if (e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
               pd.setY(pd.getY() + 10);
               if(pd.getY() >= FRAME) {
                  pd.setY(FRAME - pd.getDiameter());
               }
            }
            else if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
               pd.setX(pd.getX() + 10);
               if(pd.getX() >= FRAME) {
                  pd.setX(FRAME - pd.getDiameter());
               }
            }
            else if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
               pd.setX(pd.getX() - 10);
               if(pd.getX() <= pd.getRadius()) {
                  pd.setX(pd.getDiameter());
               }
            }
         }
      }
   }