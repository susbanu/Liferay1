package com.test.applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestApplet extends Applet implements ActionListener{
	
	TextField txtSelection;
	Button btnShow;
	int flag=0;
	
	@Override
	public void init() {

		txtSelection=new TextField(10);
		add(txtSelection);
		
		btnShow=new Button("Get Diffferent Shapes");
		add(btnShow);
		
		btnShow.addActionListener(this);

	}
	
	public void paint(Graphics g){
		
		int selected=0;
		if(flag!=0){
			selected=Integer.parseInt(txtSelection.getText());
		}
			
		g.drawString("Enter 1 for Rectangle And 2 for Oval",0, 0);
		
		switch (selected) {
		case 1:
				g.setColor(Color.BLUE);
				g.fillRect(500, 100, 250, 100);
			break;
		case 2:
				g.setColor(Color.RED);
				g.fillOval(500, 100, 100, 100);
			break;
		default:
			g.drawString("Enter 1 And 2 Only Dear......", 500, 100);
			g.setColor(Color.RED);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		flag++;
		repaint();
	}
}
