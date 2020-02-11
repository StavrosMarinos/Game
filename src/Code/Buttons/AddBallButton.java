package Code.Buttons;

import Code.Ball;
import Code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBallButton extends JButton implements ActionListener {
    static int number = 0;

    public AddBallButton(String text) {
        super(text);
        setOpaque(false);
        //setLocation(Game.fWidth/2,Game.fHeight/2);
        this.addActionListener(this);
        this.setVisible(true);
        //setBounds(30,200,40,30);
        this.setSize(new Dimension(65, 30));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(number>10){return;}
        Ball ball = new Ball(1, 1);
        Main.drawBalls.set.add(ball);
        number+=1;

    }
}
