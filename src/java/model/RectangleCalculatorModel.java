package model;

/**
 * @author Dawn Bykowski
 */
public class RectangleCalculatorModel {

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

        // return the area value
        return area;
    }
}
