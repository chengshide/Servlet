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
					System.out.println("book:����");
					n=100;
					break;
				case 2:
					System.out.println("book:���ݽṹ");
					n=100;
					break;
					default:
						System.out.println("ͼ�鲻���ڣ�");
						n++;
				}
			}else if(num1==2) {
				int num2=bo.lookupNum();
				switch(num2) {
				case 1:
					System.out.println("book:����");
					n=100;
					break;
				case 2:
					System.out.println("book:���ݽṹ");
					n=100;
					break;
					default:
						System.out.println("ͼ�鲻���ڣ�");
						n++;
				}
			}else {
				System.out.println("��������������ʾ�����������");
				n++;
				continue;
			}
		}while(n<50);

	}

}
