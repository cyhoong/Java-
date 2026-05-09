package Lab04;

import javax.swing.JFrame;

import edu.fcps.Bucket;

public class U2Driver04b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab04");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);

        Bucket.setSpeed(1);
        Bucket.useTotal(true);

        Bucket five = new Bucket(5);
        Bucket three = new Bucket(3);
        Bucket four = new Bucket(4);

        
        
    }

}
