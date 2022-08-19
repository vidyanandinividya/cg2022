package session5;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {

	public static void main(String[] args) {
		//FileWriter
		FileWriter fw;
		try {
			fw = new FileWriter("src/resources/myFile.txt");
			fw.append("Welcome\n");
			//fw.write("Hello from my file3");
			fw.append("Hello");
			//fw.append("Hi");
			
			fw.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		//PrintWriter
		/*PrintWriter pw;
		try {
			pw = new PrintWriter("src/resources/output.txt");
			pw.println("Hello printwriter");
			pw.println("Hello");
			pw.close();
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Files.write
		
		/*try {
			Path path=Paths.get("src/resources/fruits.txt");
			String fruits="apple mango bannana orange";
			Files.write(path,fruits.getBytes());
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

}
