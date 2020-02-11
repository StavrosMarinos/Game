package Code.Buttons;

import Code.DrawBalls;
import Code.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButton extends JButton implements ActionListener {

    public NewGameButton(String text) {
        super(text);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        Main.drawBalls =new DrawBalls();
        Main.drawBalls.set.clear();
    }
}
