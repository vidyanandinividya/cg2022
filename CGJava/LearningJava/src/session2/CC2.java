package session2;

import java.util.Arrays;

public class CC2 {
	//char []arr=new char[3];
	public static void printCombination(int n,String str,char[] arr)
	{
		if(n==arr.length)
		{
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			arr[n]=str.charAt(i);
			printCombination(n+1, str, arr);
		}
	}
	public static void main(String[] args) {
		String str="ABCD";
		CC2.printCombination(0, str, new char[str.length()]);

	}

}
