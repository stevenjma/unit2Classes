import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class School here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class School
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;

    /**
     * Default constructor for objects of class School
     */
    public School(int xLeft, int yBottom)
    {
        // initialise instance variables
        this.xLeft = xLeft;
        this.yBottom = yBottom;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle body = new Rectangle(xLeft, yBottom, 500, 250);
        g2.setColor(Color.ORANGE);
        g2.fill(body);
        Rectangle door = new Rectangle(xLeft + 250, yBottom + 150, 50, 100);
        g2.setColor(Color.RED);
        g2.fill(door);
    }

}
