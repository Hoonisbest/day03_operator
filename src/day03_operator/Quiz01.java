package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int su,n1,n2;
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		
		String s = (su%2 ==0)?"¦��":"Ȧ��";
		System.out.println(su +"="+ s);
		
		s = (su%3==0)?"3�ǹ��":"3�� ����� �ƴ�";
		System.out.println(su +"="+ s);
		
		System.out.print("�� �Է� : ");
		n1 = input.nextInt();

		System.out.print("�� �Է� : ");
		n2 = input.nextInt();
		
		s = (n1>n2)?"n1��ũ��":"n2��ũ��";
		System.out.println("n1="+n1+"\t"+"n2="+n2 +"\n"+s );
		
		
	}
}
