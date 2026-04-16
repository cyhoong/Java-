package Lab02;
import javax.swing.JFrame;

public class U2Driver02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab02");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(100, 50);
        frame.setContentPane(new Panel02());
        frame.setVisible(true);
    }

}
