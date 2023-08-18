
public class StringDemo {

	public static void main(String[] args) {
		String str1="Hello";
		
		str1=str1.toUpperCase();
		System.out.println(str1);
		
		String str2="Hello";
		String str3="Hello";
		
		String str4=new String("Welcome");
		String str5=new String("Welcome");
		
		if(str2==str3) {
			System.out.println("References are same");
		}else {
			System.out.println("Different references");
		}
		
		if(str4==str5) {
			System.out.println("References are same");
		}else {
			System.out.println("Different references");
		}
		
		if(str2.equals(str3)) {
			System.out.println("Contents are same");
		}else {
			System.out.println("Different contents");
		}
		
		if(str4.equals(str5)) {
			System.out.println("Contents are same");
		}else {
			System.out.println("Different contents");
		}
		
		str3="Hello Itians";
		str5="Hello Developers";
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

	}

}
