package Wait_Notify_NotifyAll;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();		//傍蜡 按眉 积己
		
		
		ThreadA threadA = new ThreadA(sharedObject);	//threadA, threadB积己
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();								//threadA, threadB角青
		
	}
}
