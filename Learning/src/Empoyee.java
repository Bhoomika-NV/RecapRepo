import java.util.Scanner;

public class Empoyee {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	String []arr=new String[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.println("Enter the employee name at "+i+" index");
	arr[i]=scan.next();
	}
	System.out.println("array contents are..");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print("| "+arr[i]+" |");
	}
 }

}
