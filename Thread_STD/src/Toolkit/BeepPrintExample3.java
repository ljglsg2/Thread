package Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.print("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
