import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphDrawer 
{
	
	JLabel[] frameBar; 
	JPanel northPlot;
	JFrame frameJ; 
	//TextFieldTester useMeForTextTest = new TextFieldTester();
	//Bars useMeForBarTest = new Bars(70);
	
	
	public void displayBar(int barWidth, int i) 
	{
		
		frameBar[i] = new JLabel(new Bars(barWidth)); 
		
		northPlot.removeAll(); 
		northPlot.updateUI();
		
		for(int k = 0; k<frameBar.length; k++) 
		{
			
			JLabel localLabel = frameBar[k];
			pushToPlot(localLabel);
		}
	}
	

	public void pushToPlot(JLabel jLabel) 
	{
		northPlot.add(jLabel);
		northPlot.setLayout(new BoxLayout(northPlot, BoxLayout.Y_AXIS)); 
		northPlot.setVisible(true);
	}

	
	public GraphDrawer() 
	{
		frameJ = new JFrame("GraphDrawer Frame");
		frameJ.setPreferredSize(new Dimension(500, 500));
		frameBar = new JLabel[6]; // can add more.
		northPlot = new JPanel();
		frameJ.setLayout(new BorderLayout());
		frameJ.add(northPlot, BorderLayout.NORTH);
		frameJ.pack(); 

		for (int i = 0; i < frameBar.length; i++) 
		{
			Bars bars = new Bars(0);
			frameBar[i] = new JLabel(bars);
			pushToPlot(frameBar[i]);
		}
		
		
		frameJ.setVisible(true); 
		
	}
	
}