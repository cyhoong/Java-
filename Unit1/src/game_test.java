import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class game_test extends JFrame {
    private GamePanel gamePanel;

    public game_test() {
        // 設定視窗
        setTitle("遊戲視窗");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // 建立遊戲面板
        gamePanel = new GamePanel();
        add(gamePanel);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new game_test());
    }

    // 遊戲面板類
    private static class GamePanel extends JPanel implements MouseMotionListener {
        private int ballX = 400;  // 球的X座標
        private int ballY = 300;  // 球的Y座標
        private final int BALL_RADIUS = 20;

        public GamePanel() {
            setFocusable(true);
            addMouseMotionListener(this);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // 設定背景為黑色
            setBackground(Color.BLACK);
            
            // 繪製紅色圓球
            g.setColor(Color.RED);
            g.fillOval(ballX - BALL_RADIUS, ballY - BALL_RADIUS, 
                      BALL_RADIUS * 2, BALL_RADIUS * 2);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // 更新球的位置跟著滑鼠
            ballX = e.getX();
            ballY = e.getY();
            repaint();  // 重新繪製
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // 如果需要也可以在拖曳時跟著滑鼠
            mouseMoved(e);
        }
    }
}
