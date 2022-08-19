package session5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFileDemo {
	
	private static void appendText(File file,String txt)
	{
		try(FileWriter fw=new FileWriter(file,true);
				BufferedWriter bw=new BufferedWriter(fw))
		{
			
			bw.write(txt);
			bw.newLine();
			
		}
		catch(IOException io)
		{
			System.out.println("An error occured");
			System.out.println(io.getMessage());
		}
	}

	public static void main(String[] args) {
		File file=new File("src/resources/file1.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text to append");
		appendText(file, sc.nextLine());
		System.out.println("Done!");

	}

}
