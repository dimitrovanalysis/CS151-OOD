import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldTester 
{
	
	JFrame dataFrame; 
	JTextField[] textField; 
	JPanel fieldPanel;
	
	GraphDrawer graphDrawer;
	
	public void textFieldManager(JTextField jTextField, int i) 
	{
	jTextField.addActionListener(event -> {graphDrawer.displayBar(Integer.parseInt(jTextField.getText()), i);});
	}
	
	
	public TextFieldTester() 
	{
		dataFrame = new JFrame("Data Frame");
		dataFrame.setPreferredSize(new Dimension(500, 300));
		graphDrawer = new GraphDrawer();
		textField = new JTextField[6];
		fieldPanel = new JPanel();
		
		for (int k = 0; k < textField.length; k++) {
			textField[k] = new JTextField();
			textField[k].setPreferredSize(new Dimension(400,40));
			textFieldManager(textField[k], k);
			fieldPanel.add(textField[k]);
			fieldPanel.setLayout(new BoxLayout(fieldPanel, BoxLayout.Y_AXIS));
		}
		dataFrame.add(fieldPanel);
	}
	// nested main function
	public static void main(String[] args) 
	{
		TextFieldTester myTester = new TextFieldTester();
		
		myTester.dataFrame.setLayout(new FlowLayout()); 
		
		myTester.dataFrame.pack();
		
		myTester.dataFrame.setVisible(true);
	}
	}