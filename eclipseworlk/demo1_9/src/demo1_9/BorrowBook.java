package demo1_9;

import java.util.Scanner;

public class BorrowBook {
	public int borrowB() {
		Scanner input=new Scanner(System.in);
			System.out.println("�������1-�����Ʋ���ͼ��  2-����Ų���ͼ��");
			try {
				int num=input.nextInt();
				return num;
			}catch(Exception e) {
				return 0;
			}
	}
	public int lookupName() {
		System.out.println("������ͼ�����ƣ�");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		if(name.equals("����")) {
			return 1;
		}else if( name.equals("���ݽṹ")) {
			return 2;
		}else {
			return 0;
		}
	}
	public int lookupNum() {
		System.out.println("������ͼ����ţ�");
		Scanner input=new Scanner(System.in);
		try {
			int num=input.nextInt();
			return num;
		}catch(Exception e) {
			System.out.println("������������������ʾ�������");
			return 0;
		}
	}

}
