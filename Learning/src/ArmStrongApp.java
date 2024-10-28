import java.util.Scanner;

public class ArmStrongApp {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre the number to check for Armstrong number");
		int n=scan.nextInt();
		int original=n;
		
		int count=0;
		while(n!=0) {
		 n=n/10;
			count++;
		}
		Armstrng arm = new Armstrng();
		int res=arm.findArm(original,count);
		if(res==original)
		System.out.println("The number is Armstrong");
		else
			System.out.println("The num is not Armstrong");
			
	}

}
