package net.homeip.jeffclark.popJava.test;

import java.io.FileNotFoundException;

import net.homeip.jeffclark.popJava.consoleio.popConsole;
import net.homeip.jeffclark.popJava.fileio.popFile;

public class TestAll {

	public static void main(String[] args) throws FileNotFoundException {
  
	    // popConsole Test //////////////////////////////////////////////	    
			popConsole console = new popConsole();	    
			console.getKeyStroke("Console Tests..........................\nPress return to continue");
			
			String userinput = null;

	    userinput = console.prompt("Please tell me something: ");
	    System.out.println("You entered : " + userinput);
			console.prompt("Press any key to continue...");
			/////////////////////////////////////////////////////////////////
		
	    // File Tests ///////////////////////////////////////////////////
			console.getKeyStroke("File Tests..............................\nPress return to continue");

      popFile file = new popFile(System.getProperty("user.dir") + "/data/testCSV.csv");
     	
			Integer csv = -1;
	    System.out.print(file.getFilename() + " " + file.getStatus() + System.lineSeparator());

	    while (file.getStatus()=="OPEN"){
	    		csv=file.getCSVInt();
					if (csv!=null) System.out.print(csv + " ");
	    }
	    System.out.println("EOF");
	    System.out.print(file.getFilename() + " " + file.getStatus() + System.lineSeparator());
			/////////////////////////////////////////////////////////////////

	    /*
	    System.out.print(file.getFilename()+" ");
	    System.out.println(file.getStatus());/////////////////////////////////////////
	    popFile file2 = new popFile();
    	line = "duh";
        csv = "duh";

	    System.out.println(file2.getStatus());
        file2.openCSV("\\data\\data2.txt");
	    System.out.print(file2.getFilename()+" ");
	    System.out.println(file2.getStatus());
	    
	    while ((csv=file2.getCSV()) !="EOF"){
	    	//csv=file2.getCSV();
	    	System.out.print(csv+" ");
	    	int i = Integer.parseInt(csv);
	    	System.out.println(i);

	    }
        
	    System.out.print(file2.getFilename()+" ");
	    System.out.println(file2.getStatus());
*/

        }

	
}
