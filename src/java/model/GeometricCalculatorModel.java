package model;

/**
 *
 * @author Dawn Bykowski
 */
public class GeometricCalculatorModel {

    /**
     * Calculate the area of the rectangle by using the length & width for
     * determination.
     *
     * @param length : The length of the rectangle.
     * @param width : The width of the rectangle.
     * @return area : The area of the rectangle
     */
    public final double getArea(String length, String width) {

        // convert above rectangle parameters to Double value
        double dblLength = Double.parseDouble(length);
        double dblWidth = Double.parseDouble(width);

        // calculate the area of the rectangle
        double area = dblLength * dblWidth;

        // return the rectangle area value
        return area;
    }

    /**
     * Calculate the area of the circle by using the radius for determination.
     *
     * @param radius : The radius of the circle.
     * @return cArea : The area of the circle
     */
    public final double getCircleArea(String radius) {

        // convert above cicle parameter to Double value & set pi value
        double dblRadius = Double.parseDouble(radius);
        double pi = 3.14159265359;

        // caluclate the area of the circle
        double cArea = pi * (dblRadius * dblRadius);

        // return the circle area value
        return cArea;
    }

    /**
     * Calculate the area of the triangle by using Side A & Side B for
     * determination.
     *
     * @param sideA : The A side of the triangle.
     * @param sideB : The B side of the triangle.
     * @return tArea : The area of the triangle
     */
    public final double getTriangleArea(String sideA, String sideB) {

        double dblSideA = Double.parseDouble(sideA);
        double dblSideB = Double.parseDouble(sideB);
        // caluclate the area of the triangle
        double tArea = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2));

        // return the triangle value
        return tArea;
    }
}
