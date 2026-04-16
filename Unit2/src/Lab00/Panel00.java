package Lab00;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class Panel00 extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE); //設定繪圖顏色為藍色
        g.fillRect(75, 50, 300, 125); //繪製一個藍色的（fill Rectangle）實體矩形，左上角座標為(75,50)，寬度為300像素，高度為125像素
        g.setFont(new Font("Serif", Font.BOLD, 50)); //設定字形，字體為粗體，大小為50
        g.setColor(new Color(150, 150, 0)); //設定繪圖顏色為黃色RGB
        g.drawString("Hello World", 100, 150); //繪製文字"Hello World"，位置為(100,150)
    }

}
