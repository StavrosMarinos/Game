package Code.Buttons;

import Code.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
