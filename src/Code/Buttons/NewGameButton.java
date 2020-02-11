package Code.Buttons;

import Code.DrawBalls;
import Code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButton extends JButton implements ActionListener {

    public NewGameButton(String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        synchronized (Thread.currentThread()) {
            Main.drawBalls.continueLoop=false;
            Main.drawBalls.set.clear();
            Main.drawBalls =new DrawBalls();
            Main.drawBalls.playAgain=true;
            Main.container.add(Main.drawBalls, BorderLayout.CENTER);
        }


    }
}
