class SwapingWithNoTemp {
public static void main(String[] args) {
	int a = 2 ;
	int b = 1;
	 
	b= a+b;
	System.out.println(a+"-->a , b--->"+b);
	a= b-a;
	System.out.println("a--> "+a);
	b= b-a;
	System.out.println("b--> "+b);
}
}
