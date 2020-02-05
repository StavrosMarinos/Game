package Code;

import javax.swing.*;
import java.awt.*;
import static Code.Utils.Utils.*;

public class Ball extends JPanel {
    int x;
    int y;
    int xVel;//velocity in the x axis
    int yVel;//velocity in the y axis
    int width;
    int height;
    int mass;// mass of the ball, proportional to the width and height

    public Ball(int mass,int xVel,int yVel){
        width=mass;
        height=mass;
        this.xVel=xVel;
        this.yVel=yVel;
        this.mass=mass;
        x=randCoordinateX(mass);
        y=randCoordinateY(mass);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.fillOval(this.x,this.y,this.width,this.height);
        setVisible(true);
        repaint();
    }

    public void move(){
        x=x-xVel;
        y=y-yVel;
        check();
        this.repaint();
    }

    //check for the position of the ball, not to cross the boundaries of the frame
    private void check() {
        if((this.x>=Game.fWidth-65)||(this.x<=0)){
            this.xVel=-this.xVel;
        }
        if((this.y>=Game.fHeight-90)||(this.y<=1)){
            this.yVel=-this.yVel;
        }
    }
}
