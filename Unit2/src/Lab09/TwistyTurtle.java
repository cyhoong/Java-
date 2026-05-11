package Lab09;

import java.awt.Color;

import edu.fcps.Turtle;

public class TwistyTurtle extends Turtle implements Runnable {
    private int BeginLength;
    private int EndLength;
    private int Increment;
    private double Angle;
    private int mode;

    public TwistyTurtle(double x, double y, int begin, int end,int inc, double n, int m) {
        super(x, y, 90.0);
        BeginLength = begin;
        EndLength = end;
        Increment = inc;
        Angle = n;
        mode = m;
    }

    public TwistyTurtle(double x, double y, int begin, int end,int inc, int m) {
        super(x, y, 90.0);
        BeginLength = begin;
        EndLength = end;
        Increment = inc;
        mode = m;
    }

    public void rotatet(double n) {
        turnLeft(n);
    }

    public void draw(){
        switch (mode) {
            case 1:
                super.setColor(Color.orange);
                drawShape();
                break;
            case 2:
                super.setColor(Color.blue);
                drawShape();
                break;
            case 3:
                super.setColor(Color.red);
                drawRotatedShape(45);
                break;
        }
    }

    public void drawShape() {
        for (int i = BeginLength; i <= EndLength; i += Increment) {
            forward(i);
            turnLeft(Angle);
        }
    }

    public void drawRotatedShape(double n) {
        for (int i = BeginLength; i <= EndLength; i += Increment) {
            forward(i);
            turnLeft(n);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
        }
    }

    @Override
    public void run() {
        draw();
    }

}
