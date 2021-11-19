
package rectangleassignment;

/**
 *
 * @author sayeem
 */
public class RectangleAssignment {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4,5);
        
        double area,perimeter;
        area = rec.calculateArea();
        perimeter = rec.calculatePerimeter();
        System.out.println("The area of the rectangle is: " + area + " The perimeter of the rectangle is: " + perimeter);
    }
    
    
}
