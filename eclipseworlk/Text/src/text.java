import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str=sc.nextLine();
		System.out.println(fun(str));

	}
	public static String fun(String str) {
		int n=str.length();
		StringBuffer str1=new StringBuffer(n);
		for(int i=n-1;i>=0;i--) {
			str1.append(str.charAt(i));
		}
		return str1.toString();
	}

}
