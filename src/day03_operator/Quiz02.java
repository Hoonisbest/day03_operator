package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,sum;
		
		
		//3�ǹ�� ���α׷�
		System.out.print("�� �Է�:");
		n1 = input.nextInt();
		
		if( n1%3 == 0){
		System.out.println(n1+"�� 3�� ����Դ�");
		}
		if( n1%3 >= 0){
			System.out.println(n1+"�� 3�� ����� �ƴմϴ�.");
			}
		
		//�������� Ǯ� ��� ���α׷�
		System.out.print("�� �Է�:");
		n1 = input.nextInt();
		
		String s = (n1%3 == 0)?"3�� ����Դϴ�":"3�ǹ���� �ƴմϴ�";
		System.out.println(s);
		
		//���� ���α׷�
		
		System.out.print("�� �Է�:");
		n1 = input.nextInt();
		if(n1<0) {
			System.out.println(n1+"�� ������"+(n1*-1)+"�Դϴ�.");
		}
		if(n1>=0) {
		System.out.println(n1+"�� ������"+n1+"�Դϴ�.");	
		}
		//�μ��� ū��
		System.out.print("ù��° �� �Է�:");
		n1 = input.nextInt();
		System.out.print("�ι�° �� �Է�:");
		n2 = input.nextInt();
		s = (n1>n2)?n1+"�� ū�� �Դϴ�":n2+"�� ū���Դϴ�.";
		System.out.println(s);
		//if�� �μ��� ū��
		System.out.print("ù��° �� �Է�:");
		n1 = input.nextInt();
		System.out.print("�ι�° �� �Է�:");
		n2 = input.nextInt();
		if(n1>n2) {
			System.out.println(n1+"�� ū���Դϴ�.");
		}
		if(n1<n2) {
		System.out.println(n2+"�� ū�� �Դϴ�.");	
		}
		if(n1==n2) {
			System.out.println("���� ������ �Դϴ�.");
		}
		//������ ū�� ���
		System.out.print("ù��° �� �Է�:");
		n1 = input.nextInt();
		System.out.print("�ι�° �� �Է�:");
		n2 = input.nextInt();
		System.out.print("����° �� �Է�:");
		n3 = input.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1+"�� ����ū�� �Դϴ�");
		}
		if(n2>n1 && n2>n3) {
			System.out.println(n2+"�� ����ū�� �Դϴ�");
		}
		if(n3>n1 && n3>n2) {
			System.out.println(n3+"�� ����ū�� �Դϴ�");
		}
		//�μ��� �Է¹ް� ū���� ¦���� ���
		System.out.print("ù��° �� �Է�:");
		n1 = input.nextInt();
		System.out.print("�ι�° �� �Է�:");
		n2 = input.nextInt();
		if(n1>n2 && n1%2==0){
			System.out.println(n1+"�� ��ũ�� ¦���Դϴ�.");
	     }	
		if(n1<n2 && n2%2==0){
			System.out.println(n2+"�� ��ũ�� ¦���Դϴ�.");
	     }
		//�μ��� �Է� �ް� ���� ¦��,3�ǹ��
		System.out.print("ù��° �� �Է�:");
		n1 = input.nextInt();
		System.out.print("�ι�° �� �Է�:");
		n2 = input.nextInt();
		
		sum = n1+n2;
		 s = (sum%2 == 0 && sum%3==0)?"����¦���̸鼭 3�� ����Դϴ�":"���� ¦���� �ƴϰų� 3�ǹ���� �ƴմϴ�";
		System.out.println(s);
		
	}
	
}
