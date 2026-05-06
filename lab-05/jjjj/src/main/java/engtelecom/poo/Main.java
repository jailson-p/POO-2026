package engtelecom.poo;


import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {



        Draw a= new Draw();
        a.setXscale(0,800);
        a.setYscale(0,800);
        a.setCanvasSize(800,800);

        a.circle(400,400,100);
        a.circle(400,400,150);
        a.circle(400,400,200);
        a.setPenColor(Color.RED);
        a.rectangle(250  ,600, 200,100);
        a.filledCircle(400,400, 50);
        a.enableDoubleBuffering();
        double[] x= {100,200,400, 500};
        double[] y= {100, 200, 200, 100};
        a.polygon(x,y);

        a.setFontSize(90);
        a.text(600,600,"ouuuuu!");

        for (int i = 0; i < 10; i++) {

            a.clear();
            a.text(400,400,""+i);
            TimeUnit.SECONDS.sleep(1);
            a.show();
        }

        a.setPenColor(Color.lightGray);
        for (int i = 0; i < 800; i+=50) {
            a.line(i,0,i,800);
            a.line(0,i,800,i);

        }
        a.show();

    }
}
