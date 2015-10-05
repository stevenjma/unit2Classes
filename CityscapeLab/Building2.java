import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Write a description of class Building2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building2
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;
    private int num;
    private int othercount;

    /**
     * Default constructor for objects of class Building2
     */
    public Building2(int x, int y, int z)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yBottom = y;
        this.num = z;
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
        int count = 0;
        while (othercount != num)
        {
            Rectangle body = new Rectangle(this.xLeft, this.yBottom + count, 115, 15);
            g2.setColor(Color.RED);
            g2.fill(body);
            othercount += 1;
            count += 15;
        }
        Rectangle door = new Rectangle(this.xLeft + 45, this.yBottom + count - 25, 25, 25);
        g2.setColor(Color.BLACK);
        g2.fill(door);
    }

}
