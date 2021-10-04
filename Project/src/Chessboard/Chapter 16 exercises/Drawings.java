import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JPanel implements MouseListener
{
    private final int rows = 8;                      
    private final int cols = 8;
	private final int x = 10;                     
    private final int y = 10;                   
    private final int squareSide = 40;                                          
    private final Color colour1 = Color.lightGray;   
    private final Color colour2 = Color.gray;        
    public int mouseX;
    public int mouseY;
    public Graphics g;
    public boolean hasBeenClicked = false;
    
    
    //White Pieces
    public String wrook = ('\u2656'+ "");
    public String wkni = ('\u2658'+ "");
    public String wbish = ('\u2657'+ "");
    public String wkin = ('\u2654'+ "");
    public String wque = ('\u2655'+ "");
    public String wpaw = ('\u2659'+ "");
    
    //Black Pieces
    public String brook = ('\u265C'+ "");
    public String bkni = ('\u265E'+ "");
    public String bbish = ('\u265D'+ "");
    public String bkin = ('\u265A'+ "");
    public String bque = ('\u265B'+ "");
    public String bpaw = ('\u265F'+ "");
    
    
    
    
    //board rows and cols
    int col1 = 15;
    int col2 = 55;
    int col3 = 95;
    int col4 = 135;
    int col5 = 175;
    int col6 = 215;
    int col7 = 255;
    int col8 = 295;
    
    int topRow = 40;
    int topRow2 = 80;
    int bottomRow = 320;
    int bottomRow2 = 280;
    
	//white starting locations
	public int wrook1x = col1;
	public int wrook1y = topRow;
	public int wrook2x = col8;
	public int wrook2y = topRow;

	
	public int wkni1x = col2;
	public int wkni1y = topRow;
	public int wkni2x = col7;
	public int wkni2y = topRow;
	
	
	public int wbish1x = col3;
	public int wbish1y = topRow;
	public int wbish2x = col6;
	public int wbish2y = topRow;
	
	
	public int wkin1x = col4;
	public int wkin1y = topRow;
	
	
	public int 	wque1x = col5;
	public int wque1y = topRow;
	
	
	public int wpaw1x = col1;
	public int wpaw1y = topRow2;
	public int wpaw2x = col2;
	public int wpaw2y = topRow2;
	public int wpaw3x = col3;
	public int wpaw3y = topRow2;
	public int wpaw4x = col4;
	public int wpaw4y = topRow2;
	public int wpaw5x = col5;
	public int wpaw5y = topRow2;
	public int wpaw6x = col6;
	public int wpaw6y = topRow2;
	public int wpaw7x = col7;
	public int wpaw7y = topRow2;
	public int wpaw8x = col8;
	public int wpaw8y = topRow2;
	

	//black starting locations
	public int brook1x = col1;
	public int brook1y = bottomRow;
	public int brook2x = col8;
	public int brook2y = bottomRow;

		
	public int bkni1x = col2;
	public int bkni1y = bottomRow;
	public int bkni2x = col7;
	public int bkni2y = bottomRow;
	    		
	public int bbish1x = col3;
	public int bbish1y = bottomRow;
	public int bbish2x = col6;
	public int bbish2y = bottomRow;
	    		
	public int bkin1x = col4;
	public int bkin1y = bottomRow;

		
	public int bque1x = col5;
	public int bque1y = bottomRow;

		
	public int bpaw1x = col1;
	public int bpaw1y = bottomRow2;
	public int bpaw2x = col2;
	public int bpaw2y = bottomRow2;
	public int bpaw3x = col3;
	public int bpaw3y = bottomRow2;
	public int bpaw4x = col4;
	public int bpaw4y = bottomRow2;
	public int bpaw5x = col5;
	public int bpaw5y = bottomRow2;
	public int bpaw6x = col6;
	public int bpaw6y = bottomRow2;
	public int bpaw7x = col7;
	public int bpaw7y = bottomRow2;
	public int bpaw8x = col8;
	public int bpaw8y = bottomRow2;
    
    
    public Drawings()
    {
    	addMouseListener(this);
    }

    
    
//makes chess board

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
	this.g= g;
    super.paintComponent(g);
    drawBoard(g);
    g.setColor(Color.BLACK);
    g.setFont(new Font("Serif", Font.PLAIN, 30));
    
    
    //pieces
    
    
    ArrayList<Integer> cols = new ArrayList<Integer>( Arrays.asList(15, 55, 95, 135, 175, 215, 255, 295) );
    
    
     
    
    int distanceApart = 40;

    
    //White Rooks
    if(hasBeenClicked == true)
    {
    	g.setColor(Color.BLUE);
    }
	g.drawString(wrook, wrook1x, wrook1y);
	g.setColor(Color.BLACK);
	g.drawString(wrook, wrook2x, wrook2y);

	//White Knights   
	g.drawString(wkni, wkni1x, wkni1y);
	g.drawString(wkni, wkni2x, wkni2y);

	//white bishops    
	g.drawString(wbish, wbish1x, wbish1y);
	g.drawString(wbish, wbish2x, wbish2y);

	//White King
	g.drawString(wkin, wkin1x, wkin1y);

	//White Queen
	g.drawString(wque, wque1x, wque1y);

	//White Pawns
	g.drawString(wpaw, wpaw1x, wpaw1y);
	g.drawString(wpaw, wpaw2x, wpaw2y);
	g.drawString(wpaw, wpaw3x, wpaw3y);
	g.drawString(wpaw, wpaw4x, wpaw4y);
	g.drawString(wpaw, wpaw5x, wpaw5y);
	g.drawString(wpaw, wpaw6x, wpaw6y);
	g.drawString(wpaw, wpaw7x, wpaw7y);
	g.drawString(wpaw, wpaw8x, wpaw8y);
	

	//Black Rooks   
	g.drawString(brook, brook1x, brook1y);
	g.drawString(brook, brook2x, brook2y);

	//Black Knights 
	g.drawString(bkni, bkni1x, bkni1y);
	g.drawString(bkni, bkni2x, bkni2y);

	//Black bishops
	g.drawString(bbish, bbish1x, bbish1y);
	g.drawString(bbish, bbish2x, bbish2y);

	//Black King
	g.drawString(bkin, bkin1x, bkin1y);

	//Black Queen
	g.drawString(bque, bque1x, bque1y);

	//Black Pawns
	g.drawString(bpaw, bpaw1x, bpaw1y);
	g.drawString(bpaw, bpaw2x, bpaw2y);
	g.drawString(bpaw, bpaw3x, bpaw3y);
	g.drawString(bpaw, bpaw4x, bpaw4y);
	g.drawString(bpaw, bpaw5x, bpaw5y);
	g.drawString(bpaw, bpaw6x, bpaw6y);
	g.drawString(bpaw, bpaw7x, bpaw7y);
	g.drawString(bpaw, bpaw8x, bpaw8y);
    
    
    
    //if(mouseX != 0)
    //{
    	//g.drawString(bkin, mouseX, mouseY);
    	
    //}
    
    repaint();
    
  }
  
  @Override
  public void mouseClicked(MouseEvent ev)
  {

  }
  
  
  @Override
  public void mousePressed(MouseEvent e) 
  {
	// TODO Auto-generated method stub
	  //System.out.println("clicked");
	  mouseX=e.getX();
	  mouseY=e.getY();
	  //System.out.println(mouseX + " " + mouseY);
	 
	    
	  //System.out.println(hasBeenClicked);
	  if(hasBeenClicked == false)
	  {
		  if(mouseX >= wrook1x -19 && mouseX < wrook1x + 19 && mouseY >= wrook1y -19 && mouseY < wrook1y + 19)
		  {
			  hasBeenClicked = true;

		  }
		  

	  }
	  else
	  {

		  hasBeenClicked = false;
		  wrook1x = mouseX;
		  wrook1y = mouseY;

	  }
	  //System.out.println(hasBeenClicked);
	  

	  
  }



  @Override
  public void mouseReleased(MouseEvent e) 
  {
	// TODO Auto-generated method stub
	
  }



  @Override
  public void mouseEntered(MouseEvent e) 
  {
	// TODO Auto-generated method stub
	
  }



  @Override
  public void mouseExited(MouseEvent e) 
  {
	// TODO Auto-generated method stub
	
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