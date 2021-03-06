package model;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JFileChooser;


public class WriteFile {
	
	String log;
	
	public WriteFile(String log)
	{
		this.log = log;
	}
	
	public String write()
	{
		BufferedWriter writer = null;
		JFileChooser  chooser= new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showSaveDialog(null);

		String path=chooser.getSelectedFile().getAbsolutePath();
		String filename=chooser.getSelectedFile().getName();

		try 
		{
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename + ".txt"), "utf-8"));
		    writer.write(log);
		    writer.close();
		} catch (IOException e) 
		{
			System.out.println(e);
		}
		
		return filename;
	}

}
