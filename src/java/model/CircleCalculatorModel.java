package model;

/**
 *
 * @author Dawn Bykowski
 */
public class CircleCalculatorModel {

    /**
     * Calculate the area of the circle by using the radius for determination.
     *
     * @param radius : The radius of the circle.
     * @return cArea : The area of the circle
     */
    public final double getArea(String radius) {

        // convert above cicle parameter to Double value & set pi value
        double dblRadius = Double.parseDouble("radius");
        double pi = 3.14159265359;

        // caluclate the area of the circle
        double cArea = pi * (dblRadius * dblRadius);

        // return the area value
        return cArea;
    }
}
