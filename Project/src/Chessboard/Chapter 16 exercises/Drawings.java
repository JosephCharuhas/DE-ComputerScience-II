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
	public boolean wrook1s = false;
	public int wrook2x = col8;
	public int wrook2y = topRow;
	public boolean wrook2s = false;

	
	public int wkni1x = col2;
	public int wkni1y = topRow;
	public boolean wkni1s = false;
	public int wkni2x = col7;
	public int wkni2y = topRow;
	public boolean wkni2s = false;
	
	
	public int wbish1x = col3;
	public int wbish1y = topRow;
	public boolean wbish1s = false;
	public int wbish2x = col6;
	public int wbish2y = topRow;
	public boolean wbish2s = false;
	
	
	public int wking1x = col4;
	public int wking1y = topRow;
	public boolean wking1s = false;
	
	
	public int 	wque1x = col5;
	public int wque1y = topRow;
	public boolean wque1s = false;
	
	
	public int wpaw1x = col1;
	public int wpaw1y = topRow2;
	public boolean wpaw1s = false;
	public int wpaw2x = col2;
	public int wpaw2y = topRow2;
	public boolean wpaw2s = false;
	public int wpaw3x = col3;
	public int wpaw3y = topRow2;
	public boolean wpaw3s = false;
	public int wpaw4x = col4;
	public int wpaw4y = topRow2;
	public boolean wpaw4s = false;
	public int wpaw5x = col5;
	public int wpaw5y = topRow2;
	public boolean wpaw5s = false;
	public int wpaw6x = col6;
	public int wpaw6y = topRow2;
	public boolean wpaw6s = false;
	public int wpaw7x = col7;
	public int wpaw7y = topRow2;
	public boolean wpaw7s = false;
	public int wpaw8x = col8;
	public int wpaw8y = topRow2;
	public boolean wpaw8s = false;
	

	//black starting locations
	public int brook1x = col1;
	public int brook1y = bottomRow;
	public boolean brook1s = false;
	public int brook2x = col8;
	public int brook2y = bottomRow;
	public boolean brook2s = false;

		
	public int bkni1x = col2;
	public int bkni1y = bottomRow;
	public boolean bkni1s = false;
	public int bkni2x = col7;
	public int bkni2y = bottomRow;
	public boolean bkni2s = false;
	    	
	
	public int bbish1x = col3;
	public int bbish1y = bottomRow;
	public boolean bbish1s = false;
	public int bbish2x = col6;
	public int bbish2y = bottomRow;
	public boolean bbish2s = false;
	
	    		
	public int bking1x = col4;
	public int bking1y = bottomRow;
	public boolean bking1s = false;

		
	public int bque1x = col5;
	public int bque1y = bottomRow;
	public boolean bque1s = false;

		
	public int bpaw1x = col1;
	public int bpaw1y = bottomRow2;
	public boolean bpaw1s = false;
	public int bpaw2x = col2;
	public int bpaw2y = bottomRow2;
	public boolean bpaw2s = false;
	public int bpaw3x = col3;
	public int bpaw3y = bottomRow2;
	public boolean bpaw3s = false;
	public int bpaw4x = col4;
	public int bpaw4y = bottomRow2;
	public boolean bpaw4s = false;
	public int bpaw5x = col5;
	public int bpaw5y = bottomRow2;
	public boolean bpaw5s = false;
	public int bpaw6x = col6;
	public int bpaw6y = bottomRow2;
	public boolean bpaw6s = false;
	public int bpaw7x = col7;
	public int bpaw7y = bottomRow2;
	public boolean bpaw7s = false;
	public int bpaw8x = col8;
	public int bpaw8y = bottomRow2;
	public boolean bpaw8s = false;
    
    
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
    if(wrook1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wrook, wrook1x, wrook1y);
	g.setColor(Color.BLACK);
    if(wrook2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wrook, wrook2x, wrook2y);
	g.setColor(Color.BLACK);

	//White Knights
    if(wkni1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wkni, wkni1x, wkni1y);
	g.setColor(Color.BLACK);
    if(wkni2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wkni, wkni2x, wkni2y);
	g.setColor(Color.BLACK);

	//white bishops
    if(wbish1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wbish, wbish1x, wbish1y);
	g.setColor(Color.BLACK);
    if(wbish2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wbish, wbish2x, wbish2y);
	g.setColor(Color.BLACK);

	//White King
    if(wking1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wkin, wking1x, wking1y);
	g.setColor(Color.BLACK);

	//White Queen
    if(wque1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wque, wque1x, wque1y);
	g.setColor(Color.BLACK);

	//White Pawns
    if(wpaw1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw1x, wpaw1y);
	g.setColor(Color.BLACK);
    if(wpaw2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw2x, wpaw2y);
	g.setColor(Color.BLACK);
    if(wpaw3s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw3x, wpaw3y);
	g.setColor(Color.BLACK);
    if(wpaw4s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw4x, wpaw4y);
	g.setColor(Color.BLACK);
    if(wpaw5s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw5x, wpaw5y);
	g.setColor(Color.BLACK);
    if(wpaw6s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw6x, wpaw6y);
	g.setColor(Color.BLACK);
    if(wpaw7s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw7x, wpaw7y);
	g.setColor(Color.BLACK);
    if(wpaw8s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(wpaw, wpaw8x, wpaw8y);
	g.setColor(Color.BLACK);
	

	//Black Rooks  
    if(brook1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(brook, brook1x, brook1y);
	g.setColor(Color.BLACK);
    if(brook1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(brook, brook2x, brook2y);
	g.setColor(Color.BLACK);

	//Black Knights 
    if(bkni1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bkni, bkni1x, bkni1y);
	g.setColor(Color.BLACK);
    if(bkni2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bkni, bkni2x, bkni2y);
	g.setColor(Color.BLACK);

	//Black bishops
    if(bbish1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bbish, bbish1x, bbish1y);
	g.setColor(Color.BLACK);
    if(bbish2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bbish, bbish2x, bbish2y);
	g.setColor(Color.BLACK);

	//Black King
    if(bking1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bkin, bking1x, bking1y);
	g.setColor(Color.BLACK);

	//Black Queen
    if(bque1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bque, bque1x, bque1y);
	g.setColor(Color.BLACK);

	//Black Pawns
    if(bpaw1s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw1x, bpaw1y);
	g.setColor(Color.BLACK);
    if(bpaw2s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw2x, bpaw2y);
	g.setColor(Color.BLACK);
    if(bpaw3s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw3x, bpaw3y);
	g.setColor(Color.BLACK);
    if(bpaw4s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw4x, bpaw4y);
	g.setColor(Color.BLACK);
    if(bpaw5s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw5x, bpaw5y);
	g.setColor(Color.BLACK);
    if(bpaw6s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw6x, bpaw6y);
	g.setColor(Color.BLACK);
    if(bpaw7s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw7x, bpaw7y);
	g.setColor(Color.BLACK);
    if(bpaw8s == true)
	{
    	g.setColor(Color.BLUE);
    }
	g.drawString(bpaw, bpaw8x, bpaw8y);
	g.setColor(Color.BLACK);
    
    
    
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
			  wrook1s = true;

		  }
		  if(mouseX >= wrook2x -19 && mouseX < wrook2x + 19 && mouseY >= wrook2y -19 && mouseY < wrook2y + 19)
		  {
			  hasBeenClicked = true;
			  wrook2s = true;

		  }
		  if(mouseX >= wkni1x -19 && mouseX < wkni1x + 19 && mouseY >= wkni1y -19 && mouseY < wkni1y + 19)
		  {
			  hasBeenClicked = true;
			  wkni1s = true;

		  }
		  if(mouseX >= wkni2x -19 && mouseX < wkni2x + 19 && mouseY >= wkni2y -19 && mouseY < wkni2y + 19)
		  {
			  hasBeenClicked = true;
			  wkni2s = true;

		  }
		  if(mouseX >= wbish1x -19 && mouseX < wbish1x + 19 && mouseY >= wbish1y -19 && mouseY < wbish1y + 19)
		  {
			  hasBeenClicked = true;
			  wbish1s = true;

		  }
		  if(mouseX >= wbish2x -19 && mouseX < wbish2x + 19 && mouseY >= wbish2y -19 && mouseY < wbish2y + 19)
		  {
			  hasBeenClicked = true;
			  wbish2s = true;

		  }
		  if(mouseX >= wking1x -19 && mouseX < wking1x + 19 && mouseY >= wking1y -19 && mouseY < wking1y + 19)
		  {
			  hasBeenClicked = true;
			  wking1s = true;

		  }
		  if(mouseX >= wque1x -19 && mouseX < wque1x + 19 && mouseY >= wque1y -19 && mouseY < wque1y + 19)
		  {
			  hasBeenClicked = true;
			  wque1s = true;

		  }
		  if(mouseX >= wpaw1x -19 && mouseX < wpaw1x + 19 && mouseY >= wpaw1y -19 && mouseY < wpaw1y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw1s = true;

		  }
		  if(mouseX >= wpaw2x -19 && mouseX < wpaw2x + 19 && mouseY >= wpaw2y -19 && mouseY < wpaw2y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw2s = true;

		  }
		  if(mouseX >= wpaw3x -19 && mouseX < wpaw3x + 19 && mouseY >= wpaw3y -19 && mouseY < wpaw3y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw3s = true;

		  }
		  if(mouseX >= wpaw4x -19 && mouseX < wpaw4x + 19 && mouseY >= wpaw4y -19 && mouseY < wpaw4y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw4s = true;

		  }
		  if(mouseX >= wpaw5x -19 && mouseX < wpaw5x + 19 && mouseY >= wpaw5y -19 && mouseY < wpaw5y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw5s = true;

		  }
		  if(mouseX >= wpaw6x -19 && mouseX < wpaw6x + 19 && mouseY >= wpaw6y -19 && mouseY < wpaw6y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw6s = true;

		  }
		  if(mouseX >= wpaw7x -19 && mouseX < wpaw7x + 19 && mouseY >= wpaw7y -19 && mouseY < wpaw7y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw7s = true;

		  }
		  if(mouseX >= wpaw8x -19 && mouseX < wpaw8x + 19 && mouseY >= wpaw8y -19 && mouseY < wpaw8y + 19)
		  {
			  hasBeenClicked = true;
			  wpaw8s = true;

		  }
		  
		  
		  
		  
		  //black pieces 
		  
		  
		  if(mouseX >= brook1x -19 && mouseX < brook1x + 19 && mouseY >= brook1y -19 && mouseY < brook1y + 19)
		  {
			  hasBeenClicked = true;
			  brook1s = true;

		  }
		  if(mouseX >= brook2x -19 && mouseX < brook2x + 19 && mouseY >= brook2y -19 && mouseY < brook2y + 19)
		  {
			  hasBeenClicked = true;
			  brook2s = true;

		  }
		  if(mouseX >= bkni1x -19 && mouseX < bkni1x + 19 && mouseY >= bkni1y -19 && mouseY < bkni1y + 19)
		  {
			  hasBeenClicked = true;
			  bkni1s = true;

		  }
		  if(mouseX >= bkni2x -19 && mouseX < bkni2x + 19 && mouseY >= bkni2y -19 && mouseY < bkni2y + 19)
		  {
			  hasBeenClicked = true;
			  bkni2s = true;

		  }
		  if(mouseX >= bbish1x -19 && mouseX < bbish1x + 19 && mouseY >= bbish1y -19 && mouseY < bbish1y + 19)
		  {
			  hasBeenClicked = true;
			  bbish1s = true;

		  }
		  if(mouseX >= bbish2x -19 && mouseX < bbish2x + 19 && mouseY >= bbish2y -19 && mouseY < bbish2y + 19)
		  {
			  hasBeenClicked = true;
			  bbish2s = true;

		  }
		  if(mouseX >= bking1x -19 && mouseX < bking1x + 19 && mouseY >= bking1y -19 && mouseY < bking1y + 19)
		  {
			  hasBeenClicked = true;
			  bking1s = true;

		  }
		  if(mouseX >= bque1x -19 && mouseX < bque1x + 19 && mouseY >= bque1y -19 && mouseY < bque1y + 19)
		  {
			  hasBeenClicked = true;
			  bque1s = true;

		  }
		  if(mouseX >= bpaw1x -19 && mouseX < bpaw1x + 19 && mouseY >= bpaw1y -19 && mouseY < bpaw1y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw1s = true;

		  }
		  if(mouseX >= bpaw2x -19 && mouseX < bpaw2x + 19 && mouseY >= bpaw2y -19 && mouseY < bpaw2y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw2s = true;

		  }
		  if(mouseX >= bpaw3x -19 && mouseX < bpaw3x + 19 && mouseY >= bpaw3y -19 && mouseY < bpaw3y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw3s = true;

		  }
		  if(mouseX >= bpaw4x -19 && mouseX < bpaw4x + 19 && mouseY >= bpaw4y -19 && mouseY < bpaw4y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw4s = true;

		  }
		  if(mouseX >= bpaw5x -19 && mouseX < bpaw5x + 19 && mouseY >= bpaw5y -19 && mouseY < bpaw5y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw5s = true;

		  }
		  if(mouseX >= bpaw6x -19 && mouseX < bpaw6x + 19 && mouseY >= bpaw6y -19 && mouseY < bpaw6y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw6s = true;

		  }
		  if(mouseX >= bpaw7x -19 && mouseX < bpaw7x + 19 && mouseY >= bpaw7y -19 && mouseY < bpaw7y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw7s = true;

		  }
		  if(mouseX >= bpaw8x -19 && mouseX < bpaw8x + 19 && mouseY >= bpaw8y -19 && mouseY < bpaw8y + 19)
		  {
			  hasBeenClicked = true;
			  bpaw8s = true;

		  }
		  

	  }
	  else
	  {

		  hasBeenClicked = false;
		  if(wrook1s == true)
		  {
			  wrook1x = mouseX;
			  wrook1y = mouseY;
			  wrook1s = false;
		  }
		  if(wrook2s == true)
		  {
			  wrook2x = mouseX;
			  wrook2y = mouseY;
			  wrook2s = false;
		  }
		  if(wkni1s == true)
		  {
			  wkni1x = mouseX;
			  wkni1y = mouseY;
			  wkni1s = false;
		  }
		  if(wkni2s == true)
		  {
			  wkni2x = mouseX;
			  wkni2y = mouseY;
			  wkni2s = false;
		  }
		  if(wbish1s == true)
		  {
			  wbish1x = mouseX;
			  wbish1y = mouseY;
			  wbish1s = false;
		  }
		  if(wbish2s == true)
		  {
			  wbish2x = mouseX;
			  wbish2y = mouseY;
			  wbish2s = false;
		  }
		  if(wking1s == true)
		  {
			  wking1x = mouseX;
			  wking1y = mouseY;
			  wking1s = false;
		  }
		  if(wque1s == true)
		  {
			  wque1x = mouseX;
			  wque1y = mouseY;
			  wque1s = false;
		  }
		  
		  
		  if(wpaw1s == true)
		  {
			  wpaw1x = mouseX;
			  wpaw1y = mouseY;
			  wpaw1s = false;
		  }
		  if(wpaw2s == true)
		  {
			  wpaw2x = mouseX;
			  wpaw2y = mouseY;
			  wpaw2s = false;
		  }if(wpaw3s == true)
		  {
			  wpaw3x = mouseX;
			  wpaw3y = mouseY;
			  wpaw3s = false;
		  }if(wpaw4s == true)
		  {
			  wpaw4x = mouseX;
			  wpaw4y = mouseY;
			  wpaw4s = false;
		  }if(wpaw5s == true)
		  {
			  wpaw5x = mouseX;
			  wpaw5y = mouseY;
			  wpaw5s = false;
		  }if(wpaw6s == true)
		  {
			  wpaw6x = mouseX;
			  wpaw6y = mouseY;
			  wpaw6s = false;
		  }if(wpaw7s == true)
		  {
			  wpaw7x = mouseX;
			  wpaw7y = mouseY;
			  wpaw7s = false;
		  }if(wpaw8s == true)
		  {
			  wpaw8x = mouseX;
			  wpaw8y = mouseY;
			  wpaw8s = false;
		  }
		  
		  //black pieces 
		  
		  
		  if(brook1s == true)
		  {
			  brook1x = mouseX;
			  brook1y = mouseY;
			  brook1s = false;
		  }
		  if(brook2s == true)
		  {
			  brook2x = mouseX;
			  brook2y = mouseY;
			  brook2s = false;
		  }
		  if(bkni1s == true)
		  {
			  bkni1x = mouseX;
			  bkni1y = mouseY;
			  bkni1s = false;
		  }
		  if(bkni2s == true)
		  {
			  bkni2x = mouseX;
			  bkni2y = mouseY;
			  bkni2s = false;
		  }
		  if(bbish1s == true)
		  {
			  bbish1x = mouseX;
			  bbish1y = mouseY;
			  bbish1s = false;
		  }
		  if(bbish2s == true)
		  {
			  bbish2x = mouseX;
			  bbish2y = mouseY;
			  bbish2s = false;
		  }
		  if(bking1s == true)
		  {
			  bking1x = mouseX;
			  bking1y = mouseY;
			  bking1s = false;
		  }
		  if(bque1s == true)
		  {
			  bque1x = mouseX;
			  bque1y = mouseY;
			  bque1s = false;
		  }
		  
		  
		  if(bpaw1s == true)
		  {
			  bpaw1x = mouseX;
			  bpaw1y = mouseY;
			  bpaw1s = false;
		  }
		  if(bpaw2s == true)
		  {
			  bpaw2x = mouseX;
			  bpaw2y = mouseY;
			  bpaw2s = false;
		  }if(bpaw3s == true)
		  {
			  bpaw3x = mouseX;
			  bpaw3y = mouseY;
			  bpaw3s = false;
		  }if(bpaw4s == true)
		  {
			  bpaw4x = mouseX;
			  bpaw4y = mouseY;
			  bpaw4s = false;
		  }if(bpaw5s == true)
		  {
			  bpaw5x = mouseX;
			  bpaw5y = mouseY;
			  bpaw5s = false;
		  }if(bpaw6s == true)
		  {
			  bpaw6x = mouseX;
			  bpaw6y = mouseY;
			  bpaw6s = false;
		  }if(bpaw7s == true)
		  {
			  bpaw7x = mouseX;
			  bpaw7y = mouseY;
			  bpaw7s = false;
		  }if(bpaw8s == true)
		  {
			  bpaw8x = mouseX;
			  bpaw8y = mouseY;
			  bpaw8s = false;
		  }


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