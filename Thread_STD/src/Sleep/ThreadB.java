package Sleep;

public class ThreadB extends Thread{
	public boolean stop = false; //���� �÷���
	public boolean work = true;  //�۾� ���� ���� �÷���
	
	public void run() {
		while(!stop) {            //stop�� true�� �Ǹ� whlie�� ����
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield(); //work�� false�Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadB ����");
	}
}
