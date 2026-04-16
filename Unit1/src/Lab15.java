import edu.fcps.karel2.Display;

public class Lab15 {
    public static void main(String[] args) {
        Dancer d1 = new Dancer1(3, 7, Display.EAST, 0);
        Dancer d2 = new Dancer2(6, 5, Display.EAST, 0);
        Dancer d3 = new Dancer3(9, 3, Display.EAST, 0);
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);
        t1.start();
        t2.start();
        t3.start();
    }

}
