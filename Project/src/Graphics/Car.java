/**
 * 
 */
package chapter15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author joseph.charuhas22
 * 
 *
 */
public class Car extends JPanel
{

	public static JFrame createFrame()
	{
		JFrame frame = new JFrame("Lambo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		return frame;
		
	}
	
	
	public Car() 
	{
		// TODO Auto-generated constructor stub
	}

	
	public void paint (Graphics g)
	{
		super.paint (g);
		
		int loc = 100;
						
		//in btwn tires
		
		g.setColor(Color.BLUE);
		g.fillRect(225, 275, 200, 10);
		
		//body of car
		g.fillRect(450, 275, 50, 10);
		g.fillRect(500, 250, 10, 25);
		g.fillRect(225, 250, 10, 25);
		g.fillArc (225, 200, 325, 100, 90, 90);
		g.fillArc (300, 200, 200, 100, 90, -90);
		
		g.setColor(Color.BLACK);
		//tires
		g.fillOval(250, 250, 50, 50);
		g.fillOval(400, 250, 50, 50);		
		
		//road 
		g.fillRect(10, 300, 200000, 10);
		
		
		
		
		
		
		//Add car movement 
		
		
		
		
		
		

	}
	
	
	
	public static void main(String[] args) 
	{
		JFrame window = createFrame();
		Car lambo = new Car();
		window.add(lambo);
		

	}

}
