// by using try and catch we are showing exception handling if file is not exist.

package javaPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileReader {

	public static void main(String[] args) {
		// creating object of FileReader
		// Opening the file
		try {
	          File f=new File("file.txt");   
	            
	          
	       // creating printWriter object as p1
	          // by initiating fileWriter 
	        PrintWriter p1=new PrintWriter(new FileWriter(f), true);
	            
	     // printing sample text
	        p1.println("Hello world");
	          p1.close();
	        
	          // changing the file operation 
	          // to read-only 
	        f.setReadOnly();
	        
	     // trying to write to new file
	          PrintWriter p2=new PrintWriter(new FileWriter("file.txt"), true);
	        p2.println("Hello World");
	    }
	      
		// catching exception thrown
	    // by try block
	    catch(Exception ex) {
	       System.out.println(ex.getMessage());
	    }

	}

}
