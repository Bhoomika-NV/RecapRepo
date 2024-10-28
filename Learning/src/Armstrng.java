
public class Armstrng {
	public int findArm(int n, int count) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int power=(int)Math.pow(rem, count);
			sum=power+sum;
			n=n/10;
		}
		return sum;
		
	}

}
