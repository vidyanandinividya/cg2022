package session1;



/**
 * @author bramhavidyamishra
 *
 */
/**
 * @author bramhavidyamishra
 *
 */
/**
 * @author bramhavidyamishra
 *
 */
/**
 * @author bramhavidyamishra
 *
 */
/**
 * @author bramhavidyamishra
 *
 */
/**
 * @author bramhavidyamishra
 *
 */
public class Example {

	//This is the main class
	public static void main(String[] args) {
		//printing Hello World
		/*System.out.println("Hello World!");
		System.out.println("...and the Universe");
		System.out.println("More text to print");*/
		/*Next
		 * -- more on printing
		 * -- more variables
		 * -- more datatypes
		 */
		//System.out.println("some other text to print");
		greet(1+2);
		System.out.println("The sum is:"+sum(12,13));
		
		
	}
	
	//your own method
	
	/**
	 * @param numOfTimes
	 */
	public static void greet(int numOfTimes)
	{
		for(int i=0;i<numOfTimes;i++)
		{
			System.out.println("Greeting from the method world!!");
		}
		
		
	}
	/**
	 * @param first "accept integer value"
	 * @param second
	 * @return "integer"
	 */
	public static int sum(int first,int second)
	{
		int result=first+second;
		return result;
	}

}
