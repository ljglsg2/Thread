package Wait_Notify_NotifyAll;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;		//���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			workObject.methodB();			//������ü�� methodB()�� 10�� �ݺ� ȣ��
		}
	}
	
	
	
}
