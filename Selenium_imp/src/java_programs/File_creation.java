package java_programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++) {
		     File file = new File("E:\\trial"+i+".txt");
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	             boolean fvar = file.createNewFile();
	             FileWriter w=new FileWriter(file);
	             BufferedWriter bw=new BufferedWriter(w);
	             bw.write("File "+i+" has been created successfully");
	             System.out.println("File "+i+ "has been created successfully");
		   /*  if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }*/
	             bw.close();
			}
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }
		 	
	}

}
