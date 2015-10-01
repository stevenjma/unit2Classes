import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int bottom;
    private int left;
    private int num;
    private int count;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int bottom, int left, int num)
    {
        // initialise instance variables
        this.bottom = bottom;
        this.left = left;
        this.num = num;
    }

    /**
     * Draws the car.
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        int interval = 0;
        while (count != num)
        {
            Rectangle body = new Rectangle(this.left, this.bottom + interval, 25, 20);
            g2.setColor(Color.BLACK);
            g2.fill(body);
            g2.setColor(Color.WHITE);
            g2.draw(body);
            count += 1;
            interval += 10;
        }
        Rectangle antenna1 = new Rectangle(this.left + 15, this.bottom - 20, 5, 20);
        g2.setColor(Color.BLACK);
        g2.fill(antenna1);
        g2.setColor(Color.WHITE);
        g2.draw(antenna1);
        Rectangle antenna2 = new Rectangle(this.left + 5, this.bottom - 20, 5, 20);
        g2.setColor(Color.BLACK);
        g2.fill(antenna2);
        g2.setColor(Color.WHITE);
        g2.draw(antenna2);
    }

}
