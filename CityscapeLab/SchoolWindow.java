import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Write a description of class SchoolWindow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SchoolWindow
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;
    private int num;

    /**
     * Default constructor for objects of class SchoolWindow
     */
    public SchoolWindow(int xLeft, int yBottom)
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
        num = 0;
        while (num != 2)
        {
            Rectangle window = 
        }
    }

}
