// By this program we are adding a file to a particular drive in our system.

package javaPackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		// this is the statement written in the txt file when we open it
		
		String str = "hello this is file handling in java";
		
		// here we have created an object and assign the path.
		
        FileWriter fwrt = new FileWriter("D:\\newText.txt");

     // We are using for loop till the condition gets false in loop.
        
    for(int i=0;i<str.length();i++)
    {
        
        fwrt.write(str.charAt(i));
        }
        fwrt.close();

	}

}
