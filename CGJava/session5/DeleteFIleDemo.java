package session5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFIleDemo {

	public static void main(String[] args) {
		//File file=new File("src/resources/myFile.txt");
		Path path=Path.of("src/resources/output.txt");
		/*try {
			Files.delete(path);
			System.out.println("File Deleted");
		} catch (IOException e) {
			System.out.println("File not Deleted");
			e.printStackTrace();
		}*/
		try {
			if(Files.deleteIfExists(path))
			{
				System.out.println("File deleted");
			}
			else
			{
				System.out.println("File not deleted");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//registering the file for deletion
		//file.deleteOnExit();
		/*if(file.delete())
		{
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("File not deleted");
		}*/

	}

}
