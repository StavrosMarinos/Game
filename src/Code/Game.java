package Code;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
        public static final int fWidth=1200;
        public static final int fHeight=800;

    public Game(String title) throws HeadlessException {
        super(title);
        setSize(fWidth,fHeight);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
