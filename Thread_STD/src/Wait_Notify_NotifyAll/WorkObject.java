package Wait_Notify_NotifyAll;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� method() �۾� ����");
		notify();												// �Ͻ����� ���¿� �ִ� ThreadB�� ������ ���·� ����
		try {
			wait();												// ThreadA�� �Ͻ����� ���·� ����
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� method() �۾� ����");
		notify();												// �Ͻ����� ���¿� �ִ� ThreadA�� ������ ���·� ����
		try {
			wait();												// ThreadB�� �Ͻ����� ���·� ����
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
