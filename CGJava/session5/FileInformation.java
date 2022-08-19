package session5;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File obj=new File("src/resources/myFile.txt");
		if(obj.exists())
		{
			//Return the file name
			System.out.println("File Name: "+obj.getName());
			//return the absolute path
			System.out.println("File Path:" + obj.getAbsolutePath());
			//display whether the file is writable or not
			System.out.println("Writable?: "+obj.canWrite());
			//display whether the file is readable or not
			System.out.println("Readable? "+obj.canRead());
			//return the length of the file in bytes
			System.out.println("File size in bytes: "+obj.length());
		}
		else
		{
			System.out.println("The file does not exist");
		}

	}

}
