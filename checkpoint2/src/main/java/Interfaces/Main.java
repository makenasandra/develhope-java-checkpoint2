package Interfaces;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object[] drawables = new Object[0];

        Circle duara = new Circle();
        duara.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        Triangle triangle = new Triangle();
        triangle.draw();

        drawables[0] = new Circle();
        drawables[1] =  new Rectangle();
        drawables[2] = new Triangle();
        System.out.println(drawables);
//        drawables[0].draw();

    }
}
