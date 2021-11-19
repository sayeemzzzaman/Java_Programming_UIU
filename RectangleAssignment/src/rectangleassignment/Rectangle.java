
package rectangleassignment;

/**
 *
 * @author sayeem
 */
public class Rectangle {
    public double length,width,perimeter,area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        area = length * width;
        return area;
    }
    
    public double calculatePerimeter() {
        perimeter = (2 * length) + (2 * width);
        return perimeter;
    }  
}
