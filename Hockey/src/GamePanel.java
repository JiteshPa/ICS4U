
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015    
 * 
 * @author Christina Kemp adapted from Sam Scott */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener
{
	int mouseX = 0;
	int mouseY = 0;
	int lives = 5;
	int width = 1000;
	int height = 500;
	int numBalls = 30;
	final int pauseDuration = 0;

	FlashingBall[] ball = new FlashingBall[numBalls];

	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);

		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(400, 300, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		}

		addMouseMotionListener(this);
		Thread gameThread = new Thread(this);
		gameThread.start();

	}

	
	public static void main(String[] args) {
		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() 
	{
		while (true) 
		{
			this.requestFocus();
			lives(getGraphics());

			for (int i = 0; i < ball.length; i++) 
			{
				if (collision(ball[i])) 
				{
					lives --;

					for (i = 0; i < ball.length; i ++)
					{	
						ball[i].stopThread();
						lives(getGraphics());
					}

					try {
						Thread.sleep(1250);
					} catch (InterruptedException e) {
					}

					for (i = 0; i < ball.length; i ++)
					{						
						ball[i].startThread();
						lives(getGraphics());
					}
				}
			}

			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	public boolean collision(FlashingBall ball) 
	{
		int radius = ball.getRadius();
		double xDistance = mouseX - ball.getX();
		double yDistance = mouseY - ball.getY();
		double hyp = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));

		return hyp <= radius;
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++)
		{
			ball[i].draw(g);
		}
	}


	public void lives (Graphics g)
	{
		if (lives > 0 )
		{
			//g.setColor(Color.BLACK);
			g.setFont(new Font("New Times Roman", 50 , 30));
			g.drawString("LIVES:", 100, 100);
			g.drawString(Integer.toString(lives), 250, 100);
		}

		else 
		{
			g.setFont(new Font("New Times Roman", 100 , 100));
			g.drawString("GAME OVER", 200, 100);

			for (int i = 0; i < numBalls; i ++)
			{
				ball[i].stopThread();
			}
		}
	}
	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		mouseX = arg0.getX();
		mouseY = arg0.getY();
		repaint();
	}
}
