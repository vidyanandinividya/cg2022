package session2;

public class Array2DDemo {

	public static void main(String[] args) {
		int marks[][]= {
				{77,23,45,34,78},
				{34,23,12},
				{56,78,23,59}
		};
		System.out.println(marks.length);
	for(int i=0;i<marks.length;i++)
	{
		for(int j=0;j<marks[i].length;j++)
		{
			System.out.print(marks[i][j]+"\t");
		}
		System.out.println();
	}

	}

}
