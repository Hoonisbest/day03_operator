package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,sum;
		
		
		//3의배수 프로그램
		System.out.print("수 입력:");
		n1 = input.nextInt();
		
		if( n1%3 == 0){
		System.out.println(n1+"은 3의 배수입다");
		}
		if( n1%3 >= 0){
			System.out.println(n1+"은 3의 배수가 아닙니다.");
			}
		
		//삼항으로 풀어본 배수 프로그램
		System.out.print("수 입력:");
		n1 = input.nextInt();
		
		String s = (n1%3 == 0)?"3의 배수입니다":"3의배수가 아닙니다";
		System.out.println(s);
		
		//절댓값 프로그램
		
		System.out.print("수 입력:");
		n1 = input.nextInt();
		if(n1<0) {
			System.out.println(n1+"의 절댓값은"+(n1*-1)+"입니다.");
		}
		if(n1>=0) {
		System.out.println(n1+"의 절댓값은"+n1+"입니다.");	
		}
		//두수중 큰수
		System.out.print("첫번째 수 입력:");
		n1 = input.nextInt();
		System.out.print("두번째 수 입력:");
		n2 = input.nextInt();
		s = (n1>n2)?n1+"이 큰수 입니다":n2+"가 큰수입니다.";
		System.out.println(s);
		//if문 두수중 큰수
		System.out.print("첫번째 수 입력:");
		n1 = input.nextInt();
		System.out.print("두번째 수 입력:");
		n2 = input.nextInt();
		if(n1>n2) {
			System.out.println(n1+"이 큰수입니다.");
		}
		if(n1<n2) {
		System.out.println(n2+"가 큰수 입니다.");	
		}
		if(n1==n2) {
			System.out.println("둘이 같은수 입니다.");
		}
		//세수중 큰수 출력
		System.out.print("첫번째 수 입력:");
		n1 = input.nextInt();
		System.out.print("두번째 수 입력:");
		n2 = input.nextInt();
		System.out.print("세번째 수 입력:");
		n3 = input.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1+"가 가장큰수 입니다");
		}
		if(n2>n1 && n2>n3) {
			System.out.println(n2+"가 가장큰수 입니다");
		}
		if(n3>n1 && n3>n2) {
			System.out.println(n3+"가 가장큰수 입니다");
		}
		//두수를 입력받고 큰수가 짝수면 출력
		System.out.print("첫번째 수 입력:");
		n1 = input.nextInt();
		System.out.print("두번째 수 입력:");
		n2 = input.nextInt();
		if(n1>n2 && n1%2==0){
			System.out.println(n1+"가 더크고 짝수입니다.");
	     }	
		if(n1<n2 && n2%2==0){
			System.out.println(n2+"가 더크고 짝수입니다.");
	     }
		//두수를 입력 받고 합이 짝수,3의배수
		System.out.print("첫번째 수 입력:");
		n1 = input.nextInt();
		System.out.print("두번째 수 입력:");
		n2 = input.nextInt();
		
		sum = n1+n2;
		 s = (sum%2 == 0 && sum%3==0)?"합이짝수이면서 3의 배수입니다":"합이 짝수가 아니거나 3의배수가 아닙니다";
		System.out.println(s);
		
	}
	
}
