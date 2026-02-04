package Tasks;

public class MyThread {

	public static void main(String[] args) throws Exception{
		Custom_Thread1 t1=new Custom_Thread1();
		Custom_Thread2 t2=new Custom_Thread2();
		t1.start();
		t2.start();
		t1.sleep(30);
//		t2.sleep(300);
	}

}
