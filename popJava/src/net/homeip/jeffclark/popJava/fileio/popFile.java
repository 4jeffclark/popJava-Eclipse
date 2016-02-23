package net.homeip.jeffclark.popJava.fileio;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class popFile {
	
	//fields
	private File file;
	private String filename;
	private String status;
	private Scanner scnr;
	//Constructor
	
	public popFile() {
	    
        //System.out.println(System.getProperty("user.dir"));
        this.status = "Allocated";

	}

	
	public void openCSV(String relPath) throws FileNotFoundException {
	    
        filename=System.getProperty("user.dir")+relPath;
        this.file = new File(filename);
        //Creating Scanner instnace to read File in Java
        String delimiter =",|"+System.getProperty("line.separator");
        this.scnr = new Scanner(file).useDelimiter(delimiter);
       
	}
	
	public String getFilename() {
	    
        
            return(filename);
       
       
	}
	
	public String getStatus() {
	    
        //System.out.println("duh");
        if (this.file != null) {
            return("Open");
        } 
        else {
            return("File not opened");
        }
       
	}
	
	public String getCSV()  {
	

        if (this.scnr.hasNext()){
            return (scnr.next());
        } else
        {
        	this.scnr.close();
        	this.status="Closed";
        	return ("EOF");
        }

	}
	public String getCSVRow()  {
		

        if (this.scnr.hasNextLine()){
            String line = this.scnr.nextLine();
            return (line);
        } else
        {
        	this.scnr.close();
        	return ("EOF");
        }

	}

	

}
