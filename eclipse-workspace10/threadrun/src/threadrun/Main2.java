package threadrun;

public class Main2 implements Runnable{

	public static void main(String[] args) {
		Main2 object=new Main2();
		Thread thread=new Thread(object);
		thread.start();
		System.out.println("Not run method");
	}
	public void run()
	{
		System.out.println("Run method & thread running");
	}

}
