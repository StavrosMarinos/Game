package Code;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import static Code.Main.drawBalls;

public class DrawBalls extends JPanel {
    public Set<Ball> set = new HashSet<>();
    public int timeout;
    public boolean continueLoop=true;
    public boolean playAgain=false;

    public DrawBalls() {
        this.timeout=10;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Ball ball : set) {
            g.setColor(ball.color);
            g.fillOval(ball.x, ball.y, ball.width, ball.height);
            ball.move();
        }
    }

    public void changeGameSpeed() {
        timeout=timeout-5;
        if(timeout<5){timeout=10;}
    }

    public void play(){
        while (continueLoop) {
            try {
                Thread.currentThread().sleep(drawBalls.timeout);
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception!");
            }
            drawBalls.repaint();
        }
    }


}
