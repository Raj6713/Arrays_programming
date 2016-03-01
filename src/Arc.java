/*Write a java program which will draw an arc and will show it on the screen using the two classes*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Arc extends JPanel
{
    private final static Color VOILET=new Color(128,0,128);
    private final static Color INDIGO=new Color(75,0,130);
    private Color[] colors={Color.WHITE,Color.WHITE,VOILET,INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};
    public Arc()
    {
        setBackground(Color.WHITE);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int radius=20;
        int centreX=getWidth()/2;
        int centreY=getHeight()/2;
        for(int counter=colors.length;counter>0;counter--)
        {
            g.setColor(colors[counter-1]);
            g.fillArc(centreX-counter*radius,centreY-counter*radius,counter*radius*2,counter*radius*2,0,180);
        }

    }
}