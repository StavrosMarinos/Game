package Code.Buttons;

import Code.DrawBalls;
import Code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class StartButton extends JButton implements ActionListener {

    public StartButton(String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
            Thread.currentThread().notify();
        
        //synchronized (Thread.currentThread()) {
            //Main.drawBalls.continueLoop=false;
            // Main.drawBalls.set.clear();
            // Main.drawBalls =new DrawBalls();
            // Main.drawBalls.playAgain=true;
            // Main.container.add(Main.drawBalls, BorderLayout.CENTER);
        //}


    }
}
