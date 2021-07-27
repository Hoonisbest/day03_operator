package day03_operator;

import java.util.Scanner;

public class Ex08_if {
	public static void main(String[] args) {
		/*
		 제어문 : 프로그램 흐름을 제어한다.
		 if(조건식){
		  	중괄호 안의 내용은 if문의 종속 문장들 이다.
		  	조건식이 참인경우 중괄호의 내용이 실행된다
		  	}
		 */
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운 게임");
		System.out.println("3.게임종료");
		System.out.print(">>> : ");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("쉬운 게임 시작");
		}
		if(num == 2) {
			System.out.println("어려운 게임 시작");
		}
		if(num == 3) {
			System.out.println("종료");
		}
		
		
	}
}
