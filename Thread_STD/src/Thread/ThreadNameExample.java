package Thread;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();							//이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());	//스레드 이름얻기
		
		ThreadA threadA = new ThreadA();									//스레드 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();													//스레드 시작
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}

}
