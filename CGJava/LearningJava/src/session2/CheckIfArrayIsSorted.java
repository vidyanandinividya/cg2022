package session2;

public class CheckIfArrayIsSorted {
	//Iterative Approach
	public static  boolean isSortedArrayIterative(int arr[])
	{
		if(arr==null)
		{
			return true;
		}
		boolean status =true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
			status=false;
			break;
			}
		}
		return status;
	}
	//Recursive Approach
	public   boolean isSortedArrayRecursive(int arr[],int i)
	{
		if(arr==null || arr.length-1==i)
		{
			return true;
		}
		if(arr[i]>arr[i+1])
		{
			return false;
		}
		return isSortedArrayRecursive(arr, i+1);
	}
	public static void main(String[] args) {
		CheckIfArrayIsSorted obj=new CheckIfArrayIsSorted();
		
		int []arr=new int[] {1,3,1};
		//System.out.println(CheckIfArrayIsSorted.isSortedArrayIterative(arr));
		System.out.println(obj.isSortedArrayRecursive(arr,0));
		arr=new int[] {1,2,3};
		//System.out.println(CheckIfArrayIsSorted.isSortedArrayIterative(arr));
		System.out.println(obj.isSortedArrayRecursive(arr,0));
		arr=new int[] {3,3,3};
		//System.out.println(CheckIfArrayIsSorted.isSortedArrayIterative(arr));
		arr=null;
		//System.out.println(CheckIfArrayIsSorted.isSortedArrayIterative(arr));
		

	}

}
