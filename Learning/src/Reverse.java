import java.lang.System.Logger;
import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		String s1 = "Bhoomika will get her job soon";
		// String reversed=reversingWithPreservingSpace(s1);
		// System.out.println(s1);
		// System.out.println(reversed);
//		System.out.println(removingTheDuplicates());
//		System.out.println(removingTheDuplicatesWay2());
		// possibleSubStrings();
		// findingTheFrequencyOfChars();
	//	checkingAnagramString();
//		String longestString=longestPrefix();
//		System.out.println(longestString);
	//	reversingOnlytheword();
		 stringForamting();
	}

	public static String reversingWithPreservingSpace(String s1) {
		char[] s1arr = s1.toCharArray();
		char[] s3arr = new char[s1arr.length];
		for (int i = 0; i <= s1arr.length - 1; i++) {
			if (s1arr[i] == ' ') {
				s3arr[i] = s1arr[i];
			}
		}

		int j = s3arr.length - 1;
		for (int i = 0; i <= s1arr.length - 1; i++) {
			if (s1arr[i] != ' ') {
				if (s3arr[j] == ' ') {

					j--;
				}
				s3arr[j] = s1arr[i];
				j--;
			}
		}
		String reversed = new String(s3arr);
		return reversed;
	}

	public static String removingTheDuplicates() {
		String s1 = "sjshdsadu";
		String s2 = "";
		one: for (int j = 0; j <= s1.length() - 1; j++) {
			two: for (int i = 0; i <= s2.length() - 1; i++) {
				if (s1.charAt(j) == s2.charAt(i)) {
					continue one;
				}
			}
			s2 = s2 + s1.charAt(j);
		}
		return s2;
	}

	public static String removingTheDuplicatesWay2() {
		String s1 = "Nayana";
		String s2 = "";
		for (int i = 0; i <= s1.length() - 1; i++) {
			if (!s2.contains(String.valueOf(s1.charAt(i)))) {
				s2 = s2 + s1.charAt(i);
			}
		}
		return s2;
	}

	public static void possibleSubStrings() {
		String s1 = "bhoomika";

		for (int i = 0; i <= s1.length() - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	}

	public static void findingTheFrequencyOfChars() {
		String s1 = "Bhoomika";
		char[] arr = s1.toCharArray();

		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 1;
			if (arr[i] != ' ') {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = ' ';
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}
	}

	public static void checkingAnagramString() { // anagrams means common letters shud be present in both the strings
		String s1 = "rama", s2 = "amar";
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		// sorting the both arrays
		if (a1.length == a2.length) {
			Arrays.sort(a1);
			Arrays.sort(a2);
			for (int i = 0; i <= a1.length - 1; i++) {
				if (a1[i] != a2[i]) {
					System.out.println("String are not anagrams");
					return;
				}
			}
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
	}
	
	public static String longestPrefix() {
		String []arr= {"geeksforgeeks", "geeks", "geek", "geezer"};
		StringBuffer prefix = new StringBuffer(arr[0]);
		for(int i=1 ;i<=arr.length -1;i++)
		{
			while( prefix.length() >0 && !arr[i].startsWith(prefix.toString())) {
				prefix.setLength(prefix.length()-1);
			}
		}
		return(prefix.length()>0) ? prefix.toString() : "-1";
}
	public static void reversingOnlytheword() {
		String str = "i.like.the.job.very.much";
		//o/p :       much.very.job.the.like.i
	    String []st=str.split("\\.");
	    StringBuffer reversed = new StringBuffer();
	    for(int i=st.length-1;i>=0;i--) {
	    	reversed.append(st[i]);
	    	if(i>0) {
	    		reversed.append(".");
	    	}
	    }
	    System.out.println(reversed);
	}
	public static void stringForamting() {
		//System.out.printf("My name is Bhoomika ", 123);
		double salary = 1000;String name = "Bhoomika";
		//System.out.printf("%f",salary);
		System.out.printf("%15f",salary);
	}
}

