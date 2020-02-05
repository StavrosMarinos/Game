package Code;

public class Main {

    public static void main(String[] args) {
        Game game=new Game("The Code.Game");//create frame
        ThreadBall threadBall =new ThreadBall();//create thread
        threadBall.start();//start thread
        game.add(threadBall.ball);//add jpanel, the ball, to the frame
        game.setVisible(true);//make the frame visible
    }
    //under construction,-> more balls, buttons, and better graphics
}
