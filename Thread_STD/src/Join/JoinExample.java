package Join;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();	//sumThread�� ������ ������ ���� �����带 �Ͻ� ������Ŵ
		} catch (Exception e) {
		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}

}
