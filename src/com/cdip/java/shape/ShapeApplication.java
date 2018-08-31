package com.cdip.java.shape;

import com.cdip.java.shape.model.Rectangle;
import com.cdip.java.shape.model.Shape;
import com.cdip.java.shape.model.Square;
import com.cdip.java.shape.model.Triangle;

public class ShapeApplication {

    public static void main(String[] a) {

        Shape rectangle = new Rectangle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        Shape[] shapes = {rectangle, square, triangle};

        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }
}
