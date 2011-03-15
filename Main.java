/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author naveeouthaphone
 */
import processing.core.*;

public class Main extends PApplet {

    Car ourCar;
    Car ourCar2;
    Car ourCar3;
    Car ourCar4;
    Car ourCar5;
    Car ourCar6;
    Car ourCar7;
    Car ourCar8;
    Car ourCar9;
    Car ourCar10;

    @Override
    public void setup() {
        size(500, 500);
        smooth();
        int inc = 500 / 11;
        int x = inc;
        int s = 10;
        ourCar = new Car(this, 0, x, s);
        ourCar2 = new Car(this, 0, x += inc, s / 2);
        ourCar3 = new Car(this, 0, x += inc, s / 3);
        ourCar4 = new Car(this, 0, x += inc, s / 4);
        ourCar5 = new Car(this, 0, x += inc, s * 2);
        ourCar6 = new Car(this, 0, x += inc, s / 4);
        ourCar7 = new Car(this, 0, x += inc, s * 3);
        ourCar8 = new Car(this, 0, x += inc, s / 2);
        ourCar9 = new Car(this, 0, x += inc, s * 4);
        ourCar10 = new Car(this, 0, x += inc, s / 5);
    }

    @Override
    public void draw() {
        background(204);
        ourCar.draw();
        ourCar.moveLeft();
        ourCar2.draw();
        ourCar2.moveLeft();
        ourCar3.draw();
        ourCar3.moveLeft();
        ourCar4.draw();
        ourCar4.moveLeft();
        ourCar5.draw();
        ourCar5.moveLeft();
        ourCar6.draw();
        ourCar6.moveLeft();
        ourCar7.draw();
        ourCar7.moveLeft();
        ourCar8.draw();
        ourCar8.moveLeft();
        ourCar9.draw();
        ourCar9.moveLeft();
        ourCar10.draw();
        ourCar10.moveLeft();
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"--present", "cars.Main"});
    }
}
