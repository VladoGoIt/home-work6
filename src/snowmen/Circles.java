package snowmen;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.Random;

/**
 * Created by Vlado on 06.09.2017.
 */
public class Circles {
   protected static Circle[] generateCircles(int count){
        Random random = new Random();
        Circle [] circles = new Circle[count];

        for (int i = 0; i < count; i++){
            Color color = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    0.6f);
            circles [i] = new Circle(
                    (300),
                    random.nextInt((int) (circles[i-1].getRadius() + circles[i].getRadius())),
                    random.nextInt(80),
                    Paint.valueOf(color.toString()));
        }
        return circles;

    }
}
