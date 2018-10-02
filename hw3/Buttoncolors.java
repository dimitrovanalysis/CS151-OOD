import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Buttoncolors extends JFrame implements ActionListener{
   Color color = Color.RED;
   JButton redButton;
   JButton greenButton;
   JButton blueButton;
   Container container;
   
   public Buttoncolors(){
       container = getContentPane();
       setTitle("Click My Buttons!");
       setLayout(new FlowLayout());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       redButton = new JButton("Red");
       greenButton = new JButton("Green");
       blueButton = new JButton("Blue");
       
       this.add(redButton);
       this.add(greenButton);
       this.add(blueButton);

       redButton.addActionListener(this);
       greenButton.addActionListener(this);
       blueButton.addActionListener(this);
       
       setSize(800, 800);
       setVisible(true);  
   
   }  
   public static void main(String[] args) {
       new Buttoncolors();

   }
   public void paint(Graphics g) {
       super.paint(g);
  
paintIcon(g);
}
   public void paintIcon(Graphics g){
       g.setColor(color);
       g.fillOval(300, 300, 300, 300);
   }

   public void actionPerformed(ActionEvent e) {
       if(e.getSource() == redButton){
           color = Color.RED;
       }
       else if(e.getSource() == greenButton){
           color = Color.GREEN;
       }
       else if(e.getSource() == blueButton){
           color = Color.BLUE;
       }
       repaint();
   }

}