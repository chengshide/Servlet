import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String str=sc.nextLine();
		System.out.println(fun(str));
	}
	public static String fun(String str) {
		String str1=str.replaceAll("b", "c");
		return str1;
	}

}
