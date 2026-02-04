package Tasks;

public class Custom_Thread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("thread "+i);
		}
	}
}
