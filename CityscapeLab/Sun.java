import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int xLeft, int yBottom)
    {
        // initialise instance variables
        this.xLeft = xLeft;
        this.yBottom = yBottom;
    }

    /**
     * Draw
     * 
     * @param   g2  The drawing stuff
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double showSun = new Ellipse2D.Double(1500, 50, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.draw(showSun);
        g2.fill(showSun);
    }

}
