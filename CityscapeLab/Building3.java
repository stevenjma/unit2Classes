import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Write a description of class Building3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building3
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;
    private int num;
    private int width;
    private int count;
    private int count1;
    private int count2;

    /**
     * Default constructor for objects of class Building3
     */
    public Building3(int xLeft, int yBottom, int num)
    {
        // initialise instance variables
        this.xLeft = xLeft;
        this.yBottom = yBottom;
        this.num = num;
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
        width = num * 10;
        Rectangle body = new Rectangle(xLeft - 50, yBottom - 265, 200, 300);
        g2.setColor(Color.BLACK);
        g2.draw(body);
        g2.setColor(Color.YELLOW);
        g2.fill(body);
        while (count != num)
        {
            Rectangle building = new Rectangle(xLeft + count1, yBottom - count2 - 300, width, 40);
            g2.setColor(Color.BLACK);
            g2.draw(building);
            g2.setColor(Color.YELLOW);
            g2.fill(building);
            count += 1;
            count1 += 5;
            count2 += 40;
            width -= 10;
        }
    }

}
