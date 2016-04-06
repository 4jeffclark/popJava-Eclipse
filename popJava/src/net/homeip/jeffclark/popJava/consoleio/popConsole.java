package net.homeip.jeffclark.popJava.consoleio;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class popConsole {

	//Fields
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Console console=System.console();
	//Constructors
	public popConsole() {
	    
   	    //System.out.println("popConsole Initialized");
	    
	}
	
	public void getKeyStroke(String prompttext) {

	    int input;
	    
	    
	    System.out.print(prompttext);
	    try {
	        input = reader.read();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
		public static String prompt(String prompttext) {

	    String input = null;
	    
	    
	    System.out.print(prompttext);
	    try {
	        input = reader.readLine();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return input;
	}
	
	
}
