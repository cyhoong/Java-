package Lab00;

import javax.swing.JFrame;

public class Driver00 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 00");
        frame.setSize(400, 300); //視窗大小
        frame.setLocation(400, 225); //視窗位置，(0,0)為螢幕左上角，(400,225)為距離左上角400像素、距離上方225像素的位置
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //關閉視窗時結束程式
        frame.setVisible(true); //顯示視窗
        frame.setContentPane(new Panel00()); //將Panel00物件設為視窗的內容面板，這樣Panel00中的繪圖就會顯示在視窗上
        frame.setVisible(true); //再次呼叫setVisible(true)以確保視窗更新並顯示Panel00的內容
    }

}
