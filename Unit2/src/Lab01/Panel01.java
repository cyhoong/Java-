package Lab01;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class Panel01 extends JPanel {

    public void paintComponent(Graphics g) {
        //背景
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 400, 400);

        //寫字
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.setColor(new Color(0, 0, 0));
        g.drawString("Welcome Home", 40, 40);

        //地面（畫綫）
        g.setColor(Color.GREEN.darker());
        g.drawLine(0, 350, 400, 350);

        //門（實體矩形）
        g.setColor(Color.BLACK);
        g.fillRect(150, 275, 50, 75);

        //房子（空心矩形）
        g.setColor(Color.RED);
        g.drawRect(100, 200, 150, 150);

        //屋頂（多邊形）
        int xPoints[] = {75, 175, 275};
        int yPoints[] = {200, 150, 200};
        g.setColor(Color.BLUE);
        g.drawPolygon(xPoints, yPoints, 3); //繪製多邊形(x, y, 頂點的數量)

        //太陽（實體橢圓）
        g.setColor(Color.YELLOW);
        g.fillOval(300, 70, 50, 50);
    }

}
