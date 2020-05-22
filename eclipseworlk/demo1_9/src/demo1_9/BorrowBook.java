package demo1_9;

import java.util.Scanner;

public class BorrowBook {
	public int borrowB() {
		Scanner input=new Scanner(System.in);
			System.out.println("输入命令：1-按名称查找图书  2-按序号查找图书");
			try {
				int num=input.nextInt();
				return num;
			}catch(Exception e) {
				return 0;
			}
	}
	public int lookupName() {
		System.out.println("请输入图书名称：");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		if(name.equals("高数")) {
			return 1;
		}else if( name.equals("数据结构")) {
			return 2;
		}else {
			return 0;
		}
	}
	public int lookupNum() {
		System.out.println("请输入图书序号：");
		Scanner input=new Scanner(System.in);
		try {
			int num=input.nextInt();
			return num;
		}catch(Exception e) {
			System.out.println("命令输入错误，请根据提示输入命令！");
			return 0;
		}
	}

}
