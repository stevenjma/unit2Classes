import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int num;
    private int count1;
    private int count2;

    /**
     * Default constructor for objects of class Road
     */
    public Road()
    {
        // initialise instance variables
        num = 0;
    }

    /**
     * Draws the road.
     * @param    g2     The graphics context
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle pavement = new Rectangle(0, 800, 2000, 500);
        g2.setColor(Color.BLACK);
        g2.fill(pavement);
        while (num != 25)
        {
            Rectangle sidewalkblock = new Rectangle(0 + count1, 750, 75, 50);
            Rectangle hash = new Rectangle(0 + count2, 900, 75, 25);
            g2.setColor(Color.BLACK);
            g2.draw(sidewalkblock);
            g2.draw(hash);
            g2.setColor(Color.GRAY);
            g2.fill(sidewalkblock);
            g2.setColor(Color.YELLOW);
            g2.fill(hash);
            num += 1;
            count1 += 75;
            count2 += 200;
        }
    }

}
