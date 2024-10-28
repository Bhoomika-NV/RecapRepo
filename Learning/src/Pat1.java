import java.util.Scanner;

public class Pat1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Hey user please enter the array length ");
	int arr[]= new int[scan.nextInt()];
	
	System.out.println("Enter the array contents");
	
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	
	System.out.println("The array contents before sorting  are..");
	
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	System.out.println("The array aftre sorting is...");
	
	int[]res=InsertionSort.selectionSort(arr);
	
	for(int i=0;i<=res.length-1;i++)
	{
		System.out.print(res[i]+" ");
	}
}
}

