package Interrupt;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true){
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
