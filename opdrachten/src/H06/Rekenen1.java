package H06;

/**
 * Created by SanderD on 15-9-2016.
 */
//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Rekenen1 extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        c = 3;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}