package Toolkit;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 		//Toolkit ��ü ���
		for(int i=0; i<5; i++) {
			toolkit.beep();							   		//������ �߻�
			try { Thread.sleep(500); } catch(Exception e) {}//0.5�ʰ� �Ͻ� ����		
		}
		
		for(int i=0; i<5; i++) {
			System.out.print("��");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
		
	}

}
