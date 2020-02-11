package Code.Buttons;

import Code.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopButton extends JButton implements ActionListener {

    public StopButton(String text) {
        super(text);
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Main.drawBalls.continueLoop=false;
        try {
            Thread.currentThread().wait();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}
