package com.maxprogrammer.application;

import com.maxprogrammer.model.entities.AbstractShape;
import com.maxprogrammer.model.entities.Circle;
import com.maxprogrammer.model.entities.Rectangle;
import com.maxprogrammer.model.entities.Shape;
import com.maxprogrammer.model.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(Color.WHITE, 3.0, 2.0));
        myShapes.add(new Circle(Color.BLACK, 2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
