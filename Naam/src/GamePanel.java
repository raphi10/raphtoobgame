import Model.Player;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Player player;

    public GamePanel(Player p) {
        this.player = p;
        setFocusable(true);
        requestFocusInWindow();
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        if (player != null && player.getSprite() != null) {
            g.drawImage(player.getSprite(), player.pos_x, player.pos_y, null);
        } else {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Player sprite not loaded!", 50, 50);
        }
    }
}