package Wait_Notify_NotifyAll;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();		//���� ��ü ����
		
		
		ThreadA threadA = new ThreadA(sharedObject);	//threadA, threadB����
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();								//threadA, threadB����
		
	}
}
