package Sleep;


public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// ThreadA, ThreadB ��ν���
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = false; //ThreadB�� ����
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = true; //ThreadB�� ����
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.stop = true; //ThreadB�� ����
		threadB.stop = true; //ThreadB�� ����
		
	}

}
