package session5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListAllFiles {

	public static void main(String[] args) {
		String directoryPath="src/session3";
		Stream<Path> fileList;
		try {
			//fileList = Files.list(Paths.get(directoryPath));
			fileList = Files.walk(Paths.get(directoryPath));
			//fileList.filter(path->path.toString().endsWith(".txt"))
			fileList.forEach(path->System.out.println(path));
			fileList.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
