package Interview;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class File_creation_data {

	public static void main(String[] args) throws Exception {
			for(int i=0;i<10;i++) {
		         File file = new File("E:\\trial"+i+".txt");
	              file.createNewFile();
	             FileWriter w=new FileWriter(file);
	             BufferedWriter bw=new BufferedWriter(w);
	             bw.write("File "+i+" has been created successfully");
	             System.out.println("File "+i+ " has been created successfully");
		   
	             bw.close();
			}
	    	
		 	
	}

}
