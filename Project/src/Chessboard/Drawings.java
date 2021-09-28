import java.awt.Graphics;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JPanel
{
    private final int rows = 8;                      
    private final int cols = 8;
	private final int x = 10;                     
    private final int y = 10;                   
    private final int squareSide = 40;                                          
    private final Color colour1 = Color.lightGray;   
    private final Color colour2 = Color.gray;        



    private void drawBoard(Graphics g) 
    {
    	for(int row = 0; row < rows; row++)
    	{
    		for(int col = 0; col < cols; col++) 
    		{    
    			if ((row + col) % 2 == 0)              
    				g.setColor(colour1);             
    			else
    				g.setColor(colour2);             
    			g.fillRect(x+col*squareSide, y + row * squareSide, squareSide, squareSide);
    		}
    	} 
    }
	


  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    drawBoard(g);
    g.setColor(Color.BLACK);
    g.setFont(new Font("Serif", Font.PLAIN, 30));
    
    
    //pieces
    int topRow = 40;
    int topRow2 = 80;
    int bottomRow = 320;
    int bottomRow2 = 280;
    
    ArrayList<Integer> cols = new ArrayList<Integer>( Arrays.asList(15, 55, 95, 135, 175, 215, 255, 295) );
    
    
    
    int col1 = 15;
    int col2 = 55;
    int col3 = 95;
    int col4 = 135;
    int col5 = 175;
    int col6 = 215;
    int col7 = 255;
    int col8 = 295;
    
    int distanceApart = 40;
    
    
    //White Pieces
    
    
    
    //White Rooks 
    String wrook = ('\u2656'+ "");
    g.drawString(wrook, col1, topRow);
    g.drawString(wrook, col8, topRow);
    
    //White Knights 
    String wkni = ('\u2658'+ "");
    g.drawString(wkni, col2, topRow);
    g.drawString(wkni, col7, topRow);
    
    //white bishops
    String wbish = ('\u2657'+ "");
    g.drawString(wbish, col3, topRow);
    g.drawString(wbish, col6, topRow);
    
    //White King
    String wkin = ('\u2654'+ "");
    g.drawString(wkin, col5, topRow);
    
    //White Queen
    String wque = ('\u2655'+ "");
    g.drawString(wque, col4, topRow);
    
    //White Pawns
    String wpaw = ('\u2659'+ "");
    for(int i = 0; i<8; i++)
    {
    	g.drawString(wpaw, cols.get(i), topRow2);
    }
    
    
    
    
    //Black Pieces
    
    
    
    //Black Rooks 
    String brook = ('\u265C'+ "");
    g.drawString(brook, col1, bottomRow);
    g.drawString(brook, col8, bottomRow);
    
    //Black Knights 
    String bkni = ('\u265E'+ "");
    g.drawString(bkni, col2, bottomRow);
    g.drawString(bkni, col7, bottomRow);
    
    //Black bishops
    String bbish = ('\u265D'+ "");
    g.drawString(bbish, col3, bottomRow);
    g.drawString(bbish, col6, bottomRow);
    
    //Black King
    String bkin = ('\u265A'+ "");
    g.drawString(bkin, col4, bottomRow);
    
    //Black Queen
    String bque = ('\u265B'+ "");
    g.drawString(bque, col5, bottomRow);
    
    //Black Pawns
    String bpaw = ('\u265F'+ "");
    for(int i = 0; i<8; i++)
    {
    	g.drawString(bpaw, cols.get(i), bottomRow2);
    }
    
    
    
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Drawings");
    window.setBounds(500, 500, 500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel canvas = new Drawings();
    canvas.setBackground(Color.WHITE);
    window.getContentPane().add(canvas);
    window.setVisible(true);
  }
}