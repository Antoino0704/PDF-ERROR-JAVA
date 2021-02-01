package pdferror;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class Gui2 {
	private JFrame win;
	private JButton button1, button2, button3;
	private JLabel label;
	
	public Gui2(JFrame win)
	{
		this.win = win;
	}
	
	
	public void Button1()
	{
		button1 = new JButton("Apri");
		button1.setFocusable(false);
		button1.setBounds(0, 190, 200, 40);
	}
	
	public void Button2()
	{
		button2 = new JButton("Danneggia");
		button2.setFocusable(false);
		button2.setBounds(400, 190, 200, 40);
	}
	
	public void ButtonInfo()
	{
		button3 = new JButton("INFO");
		button3.setFocusable(false);
		button3.setBounds(250, 0, 70, 40);
	}
	
	public void ActionButton1(JLabel label)
	{
		this.label = label;
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				Choose choser = new Choose();
				File fp = choser.Open();
				if (fp.exists())
				{
					label.setBounds(190, 290, 400, 40);
					label.setText("File Aperto");
				}
			}
			
		});
	}
	
	public void ActionButton2(JLabel label)
	{
		this.label = label;
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				Choose chose = new Choose();
				chose.Save();
				label.setBounds(0, 290, 500, 40);
				label.setText("File Danneggiato con successo");
			}
			
		});
	}
	
	public void ActionButtonInfo()
	{
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(win, "Version: 1.0.1\nAuthor: Antonino Buscarino", "INFO PDF ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
	}
	
	public void addAllButton()
	{
		win.add(button1);
		win.add(button2);
		win.add(button3);
	}

}
