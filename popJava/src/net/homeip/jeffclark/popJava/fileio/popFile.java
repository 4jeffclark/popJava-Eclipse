package net.homeip.jeffclark.popJava.fileio;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;


public class popFile extends File {
	
	//fields
	//private File file;
	private String filename;
	private String status;
	private Scanner scnr;
	//Constructor
	
	public popFile(String pathname) throws FileNotFoundException {
	    
		    super(pathname);
    		//this.file = new File(pathname);
				this.filename=pathname;
        //this.file = new File(filename);
        //Creating Scanner instnace to read File in Java
        //String delimiter =",|"+System.getProperty("line.separator");
        //this.scnr = new Scanner(file).useDelimiter(delimiter);
        this.scnr = new Scanner(this);
        //System.out.println(System.getProperty("user.dir"));
        if (this.scnr.hasNext()) {
					this.status = "OPEN";
				} else {
					this.status = "EOF";
				}

	}

	/*
	public void openAsText(String relPath) throws FileNotFoundException {
	    
        filename=System.getProperty("user.dir")+relPath;
        this.file = new File(filename);
        //Creating Scanner instnace to read File in Java
        //String delimiter =",|"+System.getProperty("line.separator");
        //this.scnr = new Scanner(file).useDelimiter(delimiter);
        this.scnr = new Scanner(file);;
       
	}
	*/
	public String getFilename() {
	    
        
            return(filename);
       
       
	}
	
	public String getStatus() {
	    
        if (!this.scnr.hasNext())  {
					this.status="EOF";
				}
					
				return(this.status);
  }
       
	public String getCSV()  {

       String delimiter =", *|"+System.lineSeparator();
        this.scnr.useDelimiter(delimiter);

        if (this.scnr.hasNext()){
            return (scnr.next());
        } else
        {
					this.status = "EOF";
        	return (null);
        }

	}
	
	
		public Integer getCSVInt()  {

       Pattern delimiter = Pattern.compile("\\s*,\\s*|\\s*"+System.lineSeparator()+"*\\s");
       // Pattern delimiter = Pattern.compile(",\\s*|\\s*"+System.lineSeparator());
        this.scnr.useDelimiter(delimiter);

        if (this.scnr.hasNextInt()){
            return ((Integer)scnr.nextInt());
        } else
        {
					this.status = "EOF";
        	return (null);
        }
	}
	
		public String getToken()  {


      if (this.scnr.hasNext()){
      		return (scnr.next());
      } else {
        	this.scnr.close();
        	this.status="CLOSED";
        	return ("");
      }

	}
		public void reset()  {
			this.scnr.reset();
			this.status="RESET";
		}
	
	public void close()  {
			this.scnr.close();
			this.status="CLOSED";
		}
}
