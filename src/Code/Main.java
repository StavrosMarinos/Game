package Code;

import Code.Buttons.AddBallButton;
import Code.Buttons.NewGameButton;
import Code.Buttons.SpeedButton;
import Code.Buttons.StopButton;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static Game game;
    public static DrawBalls drawBalls;
    public static Container container;

    public static void main(String[] args) throws InterruptedException {
        game=new Game("The Code.Game");

        AddBallButton addBallButton=new AddBallButton("AddBall");
        SpeedButton speedButton=new SpeedButton("Speed");
        NewGameButton newGameButton =new NewGameButton("NewGame");
        StopButton stopButton=new StopButton("Stop");

        JPanel buttonPanel=new JPanel(new FlowLayout());
        buttonPanel.add(addBallButton);
        buttonPanel.add(speedButton);
        buttonPanel.add(newGameButton);
        buttonPanel.add(stopButton);

        container=game.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(buttonPanel,BorderLayout.SOUTH);
        drawBalls=new DrawBalls();
        container.add(drawBalls,BorderLayout.CENTER);

        drawBalls.play();

        //drawBalls.repaint();

    }

    //under construction,-> more balls, buttons, and better graphics
}
