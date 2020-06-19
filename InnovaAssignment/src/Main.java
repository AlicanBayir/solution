import com.innova.assignment.Intersection;
import com.innova.assignment.Merge;
import com.innova.assignment.model.Rectangle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        intersectionSolution();
        mergeSolution();
    }

    private static void intersectionSolution() {
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.setFirstXPoint(0);
        rectangleOne.setFirstYPoint(10);
        rectangleOne.setSecondXPoint(10);
        rectangleOne.setSecondYPoint(0);
        Rectangle rectangleTwo = new Rectangle();
        rectangleTwo.setFirstXPoint(11);
        rectangleTwo.setFirstYPoint(5);
        rectangleTwo.setSecondXPoint(15);
        rectangleTwo.setSecondYPoint(0);
        System.out.println("Is rectangles intersect:: " +   Intersection.isTwoRectangleIntersect(rectangleOne, rectangleTwo));
        System.out.println("**************************");
    }

    private static void mergeSolution() {
        Integer[] arrayFirst = {2, 5, 8, 30};
        Integer[] arraySecond = {1, 4, 9, 25};
        System.out.println("Merged Array:: " + Arrays.toString(Merge.getMergedArray(arrayFirst, arraySecond)));
    }
}
