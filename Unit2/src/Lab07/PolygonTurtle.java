	package Lab07;
   //Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class PolygonTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
       public PolygonTurtle()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public PolygonTurtle(double n, int s)
      {
         mySize = n;
         mySides = s;
      }
       public PolygonTurtle(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
      }
       public void setSize(double n)
      {
         mySize = n;
      }
       public void setSides(int s)
      {
         mySides = s;
      }
       public void drawShape()
      {
         int angle = 180 - (180 * (mySides - 2) / mySides);
         for(int i=1 ; i <=mySides ; i++)
         {
            forward(mySize);
            turnLeft(angle);
         }
      }
      public void drawShape(int s)
      {
         for(int i=3 ; i <=s ; i++)
         {
            for(int k = 1 ; k <= i ; k++)
            {
               forward(mySize);
               turnLeft(360/i);
            }
         }
      }
   }