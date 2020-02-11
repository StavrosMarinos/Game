package Code;

import Code.Buttons.AddBallButton;
import Code.Buttons.SpeedButton;
import Code.Buttons.StopButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Main {
    public static Game game;
    public static DrawBalls drawBalls;
    public static Container container;

    public static void main(String[] args) {

        AddBallButton addBallButton=new AddBallButton("AddBall");
        SpeedButton speedButton=new SpeedButton("Speed");
        StopButton stopButton=new StopButton("Stop");

        JPanel buttonPanel=new JPanel(new FlowLayout());
        buttonPanel.add(addBallButton);
        buttonPanel.add(speedButton);
        buttonPanel.add(stopButton);

        game=new Game("The Code.Game");
        container=game.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(buttonPanel,BorderLayout.SOUTH);
        drawBalls=new DrawBalls();
        container.add(drawBalls,BorderLayout.CENTER);

            drawBalls.play();
        game.dispatchEvent(new WindowEvent(game, WindowEvent.WINDOW_CLOSING));

    }

}
