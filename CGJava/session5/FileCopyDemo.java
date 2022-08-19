package session5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;



public class FileCopyDemo {
	private static final String SRC_FILE="src/resources/employee.txt";
	private static final String DEST_FILE="src/resources/fruits.txt";
	
	public static void main(String[] args)
	{
		//fileCopyusingNIO();
		File filetocopy=new File(SRC_FILE);
		File newFile=new File(DEST_FILE);
		
		try {
			FileUtils.copyFile(filetocopy, newFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileCopyUsingApachecommon(filetocopy, newFile);
		
		
	}

	private static void fileCopyUsingApachecommon(File filetocopy, File newFile) {
		try(FileInputStream inputStream=new FileInputStream(filetocopy);
			FileOutputStream outputStream=new FileOutputStream(newFile))
		{
			IOUtils.copy(inputStream, outputStream);
			/*byte[] buffer=new byte[2098];
			int length=inputStream.read(buffer);
			while(length>0)
					{
				outputStream.write(buffer,0,length);
					}*/
			System.out.println("File get copied");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}

	private static void fileCopyusingNIO() {
		Path src=Paths.get(SRC_FILE);
		Path dest=Paths.get(DEST_FILE);
		try {
			Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
