import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of class Window here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;
    private int num;
    private int count;
    private int othercount;
    private int count3;

    /**
     * Default constructor for objects of class Window
     */
    public Window(int x, int y, int z)
    {
        this.xLeft = x;
        this.yBottom = y;
        this.num = z;
    }

    /**
     * Draws windows
     * @param    g2 graphics
     */
    public void draw(Graphics2D g2)
    {
        while (othercount != num)
        {
            while (count != 105)
            {
                if (othercount != num)
                {
                    Rectangle window = new Rectangle(xLeft + count, yBottom + count3 + 5, 10, 10);
                    g2.setColor(Color.WHITE);
                    g2.fill(window);
                    g2.setColor(Color.BLACK);
                    g2.draw(window);    
                    count += 15;
                }
            }
                
                count3 = (15 * othercount);
                othercount += 1;
                count = 0;
            }
        
        
   }

}
