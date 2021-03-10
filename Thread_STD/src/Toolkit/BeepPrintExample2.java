package Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) { //메인 스레드
		// TODO Auto-generated method stub
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.print("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
