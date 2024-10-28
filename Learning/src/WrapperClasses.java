
public class WrapperClasses {
public static void main(String[] args) {
	//1. ValueOf()
	System.out.println(Integer.valueOf("1223"));
	System.out.println(Double.valueOf("1232"));
	System.out.println(String.valueOf("Bhoomika"));
	System.out.println(Character.valueOf('b'));
	System.out.println(Byte.valueOf("12"));
	System.out.println(Short.valueOf("23"));
	System.out.println(Boolean.valueOf("false"));
	System.out.println("-------------------------");
	System.out.println(Integer.parseInt("1234")+" parseInt(String s)");
	System.out.println(Byte.parseByte("2"));
	System.out.println(Boolean.parseBoolean("false")+" Boolean.parseBoolean(boolean b)");
	System.out.println("--------------------");
	System.out.println(Integer.toString(123)+" toString()");
	System.out.println(Character.toLowerCase('A'));
	System.out.println(Character.isLowerCase('A'));
	
	
	}
}
