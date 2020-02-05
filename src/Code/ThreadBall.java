package Code;

public class ThreadBall extends Thread{
    int timeout=15;
    Ball ball;

    public ThreadBall() {
        ball=new Ball(55,5,5);
    }

    @Override
    public void run() {
            while(true) {
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ball.move();
            }

    }
}
