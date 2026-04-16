package Lab01;

import javax.swing.JFrame;

public class Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab01, Build a House");
        frame.setSize(400, 400);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel01());
        frame.setVisible(true);
    }

}
