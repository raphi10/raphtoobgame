import Model.Player;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Window");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            Image sprite = ImageIO.read(new File("playermodel.png"));
            Player player = new Player("Hero", 100, 300, 300, new ArrayList<>(), 1, 1, sprite);

            frame.add(new GamePanel(player));
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println("gekankerd");
        }
    }
}