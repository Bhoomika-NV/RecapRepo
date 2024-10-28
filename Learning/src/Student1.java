import java.util.Scanner;

public class Student1 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the number tll where the natural number has to be found");
	int n=scan.nextInt();
	Student1 st= new Student1();
	if(st.rev(n)==true) {
		System.out.println("The number is palindrome");
	}
	else {
		System.out.println("The number is not palindrome");
	}
	
}
public boolean rev(int n)
{
	int ori=n;
	int rev=0;
	while(n!=0)
	{
		int rem=n%10;
	    rev=rev*10+rem;
	    n=n/10;
	}
	if(ori==rev)
		return true;
	else
		return false;
}
}
