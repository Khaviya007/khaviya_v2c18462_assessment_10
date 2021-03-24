package threadex;

public class Main1 extends Thread{

	public static void main(String[] args) {
		Main1 thread=new Main1();
		thread.start();
		System.out.println("Its not run method");

	}
	public void run()
	{
		System.out.println("Thread running");
	}

}
