package ua.ithillel.one;

import java.util.Arrays;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Shape circle1 = new Circle(10);
        Shape square1 = new Square(10);
        Shape triangle1 = new Triangle(10, 10, 10);
        var areaOfCircle = getRoundedValue(circle1.getArea());
        var areaOfSquare = getRoundedValue(square1.getArea());
        var areaOfTriangle = getRoundedValue(triangle1.getArea());

        System.out.println("areaOfCircle = " + areaOfCircle +
                ", areaOfSquare = " + areaOfSquare +
                ", areaOfTriangle = " + areaOfTriangle);
        Shape[] shapes = {circle1, square1, triangle1};
        var sum = getSumOfAreas(shapes);
        System.out.println("sum of all areas = " + getRoundedValue(sum));
    }

    private static String getRoundedValue(double val) {
        return String.format(Locale.US, "%.2f", val);
    }

    private static double getSumOfAreas(Shape[] shapes) {
        return Arrays.stream(shapes)
                .mapToDouble(Shape::getArea)
                .sum();
    }
}
