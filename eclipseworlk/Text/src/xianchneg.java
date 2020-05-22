
public class xianchneg {

	public static void main(String[] args) {
		Runnable1 r1=new Runnable1();
		Thread t=new Thread(r1);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main:"+i);
		}
	}

}
class Runnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("runble:"+i);
		}
		
	}
	
}