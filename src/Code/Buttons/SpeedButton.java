package Code.Buttons;

import Code.Main;
import Code.Utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class SpeedButton extends JButton implements ActionListener {

    public SpeedButton(String text) {
        super(text);
        setOpaque(false);
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           Main.drawBalls.changeGameSpeed();
    }
}
