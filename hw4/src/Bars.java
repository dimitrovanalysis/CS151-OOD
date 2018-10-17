import javax.swing.Icon;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Component;
import java.awt.Graphics;


public class Bars implements Icon
{
	
	int width;
	int height;
	int counter = 0;

	public Bars(int width) 
	{ //bars constructor 
		this.width = width;
		
		this.height = 70;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) 
	{ 
		
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D.Double bar = new Rectangle2D.Double(x, y, getIconWidth(), getIconHeight());
		if(counter % 5 == 0) {
			g2.setColor(Color.BLUE);
		}
		else if(counter % 5 == 1) {
			g2.setColor(Color.RED);
		}
		else if(counter % 5 == 2){
			g2.setColor(Color.GREEN);
		}
		else if(counter % 5 == 3) {
			g2.setColor(Color.BLACK);
		}
		else if(counter % 5 == 4) {
			g2.setColor(Color.MAGENTA);
		}
		else {
			g2.setColor(Color.PINK);
		}
		counter++;
		g2.fill(bar);
		
	}
//needed from interface req
	public int getIconHeight() 
	{
		return height;
	}

	public int getIconWidth() 
	{
		return width;
	}


}