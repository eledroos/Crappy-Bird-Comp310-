package crappyBird;

import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/*
 * The downside to the way this program is implemented is that the screen just waits for a mouseclick to run
 * this means, that the image has to be downloaded first, so loading is slow.
 * It also means that Internet must be on.
 * Ideally, it'd be best to store it directly within the program, or at least call the image locally.
 */

public class Menu extends JPanel{
	//private static final long serialVersionUID = 1L;
	int highscore;
	
	//gets the background from URL
	static BufferedImage img = null;{
		try {
			img = ImageIO.read(new URL("https://dl.dropboxusercontent.com/u/25535461/CrapBird/sadfh.jpg"));
		} catch (IOException e) {
			System.out.println("WRONG MENU");
		}}
	
	boolean startGame = false;						//the boolean toggle that starts the game over in ExecuteMe
	
	
	public Menu(){
		setFocusable(true);							//waits for a mouse click, then toggles startGame
		addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				startGame = true;
			}

			});
	}
	
	public void paint (Graphics g){
		super.paint(g);
	
		g.drawImage(img, 0, 0, null);				//paints background
	
		
	}
}
	