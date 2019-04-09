//to import Graphics package
import java.awt.*;

public class MickeyMouse {

	public static void main(String[] args) {
		//to create a window
		//DrawingPanel is an object (width, height)
		DrawingPanel panel = new DrawingPanel(200,150);
		
		//call Graphics object
		Graphics g = panel.getGraphics();
		
		//draw ovals on panel and fill with blue
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		//draw square on panel and fill with red
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//draw line on panel
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		
		Color yellow = new Color (255, 255,0);
		panel.setBackground(yellow);
	}

}
