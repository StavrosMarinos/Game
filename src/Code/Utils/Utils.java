package Code.Utils;

//utilities class for generating random starting coordinates for a new ball
public class Utils {
    //Random coordinates taking into account the ball's radius which here is proportional to its mass.
    public static int randCoordinateX(int mass){
        double n;
        long nx;
        int intx;
        do{
            n = (Code.Game.fWidth-mass-10) * (Math.random());//the rectangle in which the ball will be created
            nx = Math.round(n);//must be smaller than the frame, to avoid getting out of bounds
            intx = (int) nx;
        }while((intx>= Code.Game.fWidth)||(intx-mass<=0));
        return intx;
    }
    //As java cannot return two variables i use two static methods for X and Y coordinates.
    public static int randCoordinateY(int mass){
        double n;
        long ny;
        int inty;
        do{
            n = (Code.Game.fHeight-mass-10) * (Math.random());
            ny = Math.round(n);
            inty = (int) ny;
        }while((inty>= Code.Game.fHeight)||(inty-mass<=0));
        return inty;
    }

}
