package day03_operator;

public class Ex07 {
	public static void main(String[] args) {
		/*
		  ���׿����� (���ǿ�����)
		  - ���� = (��)?(���ΰ��) : (������ ���);
		  
		 */
		int su = 8;
		String s = (su%2 ==0)?"¦��":"Ȧ��";
		System.out.println(s);
		
		su = 9;
		s = (su%2 ==0)?"¦��":"Ȧ��";
		System.out.println(s);
	}
}
