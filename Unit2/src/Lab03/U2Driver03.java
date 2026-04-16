package Lab03;

import javax.swing.JFrame;

public class U2Driver03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab03");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(100, 50);
        frame.setContentPane(new U2Panel03());
        frame.setVisible(true);
    }

}
