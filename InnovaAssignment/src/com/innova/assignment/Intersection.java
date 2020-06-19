package com.innova.assignment;

import com.innova.assignment.model.Rectangle;

public class Intersection {
    public static Boolean isTwoRectangleIntersect(Rectangle rectangleOne, Rectangle rectangleTwo ) {
        if (rectangleOne.getFirstXPoint() >= rectangleTwo.getSecondXPoint()
                || rectangleTwo.getFirstXPoint() >= rectangleOne.getSecondXPoint()) {
            return false;
        }
        if (rectangleOne.getFirstYPoint() <= rectangleTwo.getSecondYPoint()
                || rectangleTwo.getFirstYPoint() <= rectangleOne.getSecondYPoint()) {
            return false;
        }
        return true;
    }
}
