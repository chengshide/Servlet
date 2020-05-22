package demo1_9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorrowBook bo=new BorrowBook();
		int n=0;
		do {
			int num1=bo.borrowB();
			if(num1==1) {
				int name=bo.lookupName();
				switch(name) {
				case 1:
					System.out.println("book:高数");
					n=100;
					break;
				case 2:
					System.out.println("book:数据结构");
					n=100;
					break;
					default:
						System.out.println("图书不存在！");
						n++;
				}
			}else if(num1==2) {
				int num2=bo.lookupNum();
				switch(num2) {
				case 1:
					System.out.println("book:高数");
					n=100;
					break;
				case 2:
					System.out.println("book:数据结构");
					n=100;
					break;
					default:
						System.out.println("图书不存在！");
						n++;
				}
			}else {
				System.out.println("输入错误，请根据提示输入数字命令！");
				n++;
				continue;
			}
		}while(n<50);

	}

}
