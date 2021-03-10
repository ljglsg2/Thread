package Join;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();	//sumThread가 종료할 때까지 메인 스레드를 일시 정지시킴
		} catch (Exception e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}

}
