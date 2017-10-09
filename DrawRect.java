import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class DrawRect extends Applet
{
	public void paint(Graphics g)
	{
		//g.drawRect(100,100,150,100);
		
		g.drawOval(50,50,100,100);
		g.drawOval(200,50,100,100);
		g.setColor(Color.red);
		g.drawRect(100,100,150,100);
		//g.fillRect(100,100,150,100);
		
		Font obj=new Font("Comic Sans MS",1+2,36);
		g.setFont(obj);
		g.setColor(Color.blue);
		g.drawString("Keshav Mundra",150,150);
		
	
	}
	
}

/*<applet code ="DrawRect" width="500" height="500"></applet>*/