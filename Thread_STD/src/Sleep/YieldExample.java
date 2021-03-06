package Sleep;


public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// ThreadA, ThreadB 모두실행
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = false; //ThreadB만 실행
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = true; //ThreadA ThreadB 실행
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.stop = true; //ThreadA만 종료
		threadB.stop = true; //ThreadA만 종료
		
	}

}
