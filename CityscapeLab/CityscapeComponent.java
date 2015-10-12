import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent{

    int numFloors = 10;
    int sPosition = 1500;
    
    
    public CityscapeComponent(int nFloors)
    {
        this.numFloors = nFloors;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle background = new Rectangle(0, 0, 2000, 750);
        
        Road road = new Road();
        Building building1 = new Building(250, 100, 50);
        Building building2 = new Building(150, 800, 60);
        Building building3 = new Building(50, 400, 70);
        Sun sun = new Sun(sPosition);
        Building2 building4 = new Building2(200, 235, 35);
        Window window = new Window(205, 235, 30);
        Building2 building5 = new Building2(900, 10, 50);
        Window window2 = new Window(905, 10, 50);
        School school = new School(1200, 500);
        Building3 building6 = new Building3(600, 725, numFloors);
        
        g2.setColor(Color.CYAN);
        g2.draw(background);
        g2.fill(background);
        
        road.draw(g2);
        sun.draw(g2);
        building6.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        window.draw(g2);
        building5.draw(g2);
        window2.draw(g2);
        school.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
            sPosition -= 10;
            Sun sun = new Sun(sPosition);
            // request that the Java Runtime repaints this component by invoking its paintComponent method
            repaint();
    }

}
