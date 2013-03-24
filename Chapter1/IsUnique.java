package code1_1;

public class IsUnique {
	public static void main(String []args) {
		String test1 = "123fsdf567";
		String test2 = "12a%ce%!";
		if(isUniqueChars(test1))
			System.out.println("the string is unique");
		else 
			System.out.println("the string is not unique");
	}
	
	public static boolean isUniqueChars(String to_check) {
		//if the string is null then the string is not unique
		if(to_check.length() == 0)
			return false;
		int length = to_check.length();
		int count = 0;
		int [] asc = new int [128];
		for(int i = 0;i < 128;i++)
			asc[i] = 0;
		while(length != count)
			if(++asc[to_check.charAt(count++)] != 1)
				return false;
		return true;
	}
}
