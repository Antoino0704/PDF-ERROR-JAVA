package pdferror;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Gui {
	public Gui()
	{
		JFrame win = new JFrame("PDF ERROR");
		ImageIcon icon = new ImageIcon("Icon.png");
		win.setIconImage(icon.getImage());
		win.getContentPane().setBackground(Color.black);
		win.setLayout(null);
		
		JLabel label = new JLabel("Nessun File Aperto");
		label.setForeground(Color.red);
		label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 33));
		label.setBounds(160, 290, 400, 40);
		win.add(label);
		
		Gui2 gui2 = new Gui2(win);
		gui2.Button1();
		gui2.ActionButton1(label);
		gui2.Button2();
		gui2.ActionButton2(label);
		gui2.ButtonInfo();
		gui2.ActionButtonInfo();
		gui2.addAllButton();
		
		win.setResizable(false);
		win.setSize(600, 600);
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
