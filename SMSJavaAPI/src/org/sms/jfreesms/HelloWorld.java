

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet{

	private static final long serialVersionUID = 1L;
	
	public void start(){
		ActionExample.main(new String[0]);
		System.out.println(" Init Method call");
	}
	
	public void paint(Graphics g) {
        g.drawString("Hello world!", 50, 25);
    }
	
	public void destroy(){
		System.out.println(" Destroy method call ");
	}
	
}
