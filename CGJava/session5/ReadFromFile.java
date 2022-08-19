package session5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFile {

	public static void main(String[] args) {
		String fileName="src/resources/fruits.txt";
		try {
		Stream<String> fileStream=Files.lines(Paths.get(fileName));
		List<String> fruitList=Files.readAllLines(Paths.get(fileName));
		fileStream.forEach(str->System.out.println(str));
		fruitList.forEach(str->System.out.println(str));
		fileStream.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try {
			File obj=new File("src/resources/myFile.txt");
			Scanner sc=new Scanner(obj);
			System.out.println("Reading from file");
			while(sc.hasNext())
			{
				String line=sc.nextLine();
				String[] arr=line.split(",");
				int sum=0;
				for(int i=0;i<arr.length;i++)
				{
					//System.out.println(arr[i]);
					sum+=Integer.parseInt(arr[i]);
				}
				//System.out.println(line);
				System.out.println(sum);
			}
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}*/
		
	}

}
