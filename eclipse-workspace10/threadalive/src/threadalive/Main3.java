package threadalive;

public class Main3 extends Thread{
public static int amt=0;
	public static void main(String[] args) {
		Main3 thread=new Main3();
		thread.start();
		thread.setPriority(MAX_PRIORITY);
		thread.setPriority(NORM_PRIORITY);
		thread.setPriority(MIN_PRIORITY);
		thread.isAlive();
		{
			System.out.println("Thread running at this moment");
		}
		System.out.println(amt);
		amt++;
		System.out.println(amt);
	}
	public void run()
	{
		System.out.println("Run thread");
	}

}
