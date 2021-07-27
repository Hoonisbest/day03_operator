package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int su,n1,n2;
		System.out.print("수 입력 : ");
		su = input.nextInt();
		
		String s = (su%2 ==0)?"짝수":"홀수";
		System.out.println(su +"="+ s);
		
		s = (su%3==0)?"3의배수":"3의 배수가 아님";
		System.out.println(su +"="+ s);
		
		System.out.print("수 입력 : ");
		n1 = input.nextInt();

		System.out.print("수 입력 : ");
		n2 = input.nextInt();
		
		s = (n1>n2)?"n1이크다":"n2가크다";
		System.out.println("n1="+n1+"\t"+"n2="+n2 +"\n"+s );
		
		
	}
}
