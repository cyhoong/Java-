package Lab04;

import javax.swing.JFrame;
import edu.fcps.Bucket;

public class U2Driver04a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab04");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);

        Bucket.setSpeed(5);
        Bucket.useTotal(true);

        Bucket five = new Bucket(5);
        Bucket three = new Bucket(3);

        three.fill();//3
        three.pourInto(five);
        three.fill();
        three.pourInto(five);//6
        five.spill();//1
        three.spill();

        five.fill();//5
        five.pourInto(three);//2
        three.spill();
        five.pourInto(three);
        five.fill();
        five.pourInto(three);//7
        five.spill();
        three.spill();

        three.fill();
        three.pourInto(five);
        three.fill();
        three.pourInto(five);
        five.spill();
        three.pourInto(five);
        three.fill();//4

        five.fill();//8

    }
    

}
