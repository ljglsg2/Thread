package Wait_Notify_NotifyAll;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 method() 작업 실행");
		notify();												// 일시정지 상태에 있는 ThreadB를 실행대기 상태로 만듬
		try {
			wait();												// ThreadA를 일시정지 상태로 만듬
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 method() 작업 실행");
		notify();												// 일시정지 상태에 있는 ThreadA를 실행대기 상태로 만듬
		try {
			wait();												// ThreadB를 일시정지 상태로 만듬
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
