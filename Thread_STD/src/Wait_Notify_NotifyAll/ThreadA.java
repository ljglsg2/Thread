package Wait_Notify_NotifyAll;

public class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;		//���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			workObject.methodA();			//������ü�� methodA()�� 10�� �ݺ� ȣ��
		}
	}
	
	
	
}
