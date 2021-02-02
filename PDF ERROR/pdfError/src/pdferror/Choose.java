package pdferror;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class Choose {
	private JFileChooser openchooser, savechooser;
	private FileNameExtensionFilter fil1;
	private String file;
	
	public Choose()
	{
		fil1 = new FileNameExtensionFilter("File pdf", "pdf");
		
		openchooser = new JFileChooser();
		openchooser.setAcceptAllFileFilterUsed(false);
	
		savechooser = new JFileChooser();
		savechooser.setAcceptAllFileFilterUsed(false);
		
		openchooser.addChoosableFileFilter(fil1);
		savechooser.addChoosableFileFilter(fil1);
	}
	
	public File Open()
	{
		openchooser.showOpenDialog(null);
		file = openchooser.getSelectedFile().getPath();
		File fp = new File(file);
		return fp;
	}
	
	public void Save()
	{
		savechooser.showSaveDialog(null);
		file = savechooser.getSelectedFile().getPath();
		File fp = new File(file + ".pdf");
		try {
			fp.createNewFile();
		} 
		catch (IOException e1) 
		{
			return;
		}
		
	}

}
