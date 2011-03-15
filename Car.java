/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;
import processing.core.PApplet;


public class Car {
    private int locationX;
    private int locationY;
    private int speed;
    private PApplet parent;

    public Car(PApplet p, int x, int y, int s){
        locationX = x;
        locationY = y;
        speed = s;
        parent = p;
    }

    public void draw(){
        parent.fill(255, 0, 0);
        parent.rect(locationX, locationY, 30, 10);
    }

    public void moveLeft(){
        if(locationX < parent.width){
            locationX += speed;
        }else{
            locationX = 0;
        }
    }
}
