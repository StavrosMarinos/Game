package Code.Utils;

import Code.Main;

//utilities class for generating random starting coordinates and mass for a new ball
public class Utils {
    static int buttonPanelHeight=40;

    public static int randCoordinateX(int mass){
        double n;
        long nx;
        int intx;
        //the rectangle in which the ball will be created
        //must be smaller than the container, to avoid getting out of bounds
        n = (Main.container.getWidth()-mass-10) * (Math.random())+5;
        nx = Math.round(n);
        intx = (int) nx;

        return intx;
    }

    public static int randCoordinateY(int mass){
        double n;
        long ny;
        int inty;
        n = (Code.Game.fHeight-mass-buttonPanelHeight-10) * (Math.random())+5;
        ny = Math.round(n);
        inty = (int) ny;

        return inty;
    }

    public static int randMass(){
        double n;
        long nl;
        int m;
        n = 20* (Math.random())+10;//minimum mass 10
        nl = Math.round(n);
        m = (int) nl;

        return m;
    }




}
