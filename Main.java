
package cars;

import processing.core.*;
import java.util.Random;

public class Main extends PApplet {
    //Create an array for 10 cars.
    final int c = 10;
    Car [] ourCar = new Car [c];

    @Override
    public void setup() {
        size(500, 500); // Display a graphic window 500 by 500.
        smooth();
        int inc = 500 / 13; // display each car evenly.
        int x = inc;
        Random randomGenerator = new Random(); //Generate random numbers for speed.
        for(int i = 0; i < c; i++) {
            ourCar[i] = new Car(this, 0, x+= inc, randomGenerator.nextInt(15) + 1);
            //Loop to create the 10 cars.
        }
    }

    @Override
    public void draw() {
        background(204);
        for(int i = 0; i < c; i++) {
            ourCar[i].draw();
            ourCar[i].moveLeft();
            //Loop the cars to be drawn.
        }
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"--present", "cars.Main"});
    }
}
