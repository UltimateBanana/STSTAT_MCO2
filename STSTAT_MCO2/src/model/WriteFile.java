package model;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteFile {
	
	int indexTextFile;
	String log;
	
	public WriteFile(int indexTextFile, String log)
	{
		this.indexTextFile = indexTextFile;
		this.log = log;
	}
	
	public void write()
	{
		BufferedWriter writer = null;

		try 
		{
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(indexTextFile + ".txt"), "utf-8"));
		    writer.write(log);
		    writer.close();
		} catch (IOException e) 
		{
			System.out.println(e);
		}
	}

}
