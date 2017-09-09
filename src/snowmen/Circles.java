package snowmen;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.Random;

/**
 * Created by Vlado on 06.09.2017.
 */
public class Circles {
        static Circle[] generateCircles(int count){
            final int X = 300;

        Random random = new Random();
        Circle [] circles = new Circle[count];


        for (int i = 0; i < count; i++){
            Color color = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    0.6f);


            circles [i] = new Circle(
                    (X),
                    Test.gen(i),
                    //Distance.calc(i, circles[i].getRadius(), circles[i].getRadius()),
                    random.nextInt(80),
                    Paint.valueOf(color.toString()));
            double  radius =circles[i].getRadius();
        }

        return circles;

    }

}
