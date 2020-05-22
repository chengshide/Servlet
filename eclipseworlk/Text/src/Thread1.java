
public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("main:"+i);
		}
	}

}
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread:"+i);
		}
	}
}
