package day03_operator;

public class Ex05 {
	public static void main(String[] args) {
		/*
		  �� ������
		  -�� �Ǵ� ������ ǥ��
		  - ||(or) : �ϳ��� ���� �����ϸ� ����� ��
		  	-true || false : true
		  	-false || false :false
		  	-( (10>20) || ( 20 == 20) ) : true
		  -&&(and) : ��ΰ� ���϶� ��, �ϳ��� �����Ͻ� ����
		   - true && false : false
		   - true && true : true
		  -!(not) : ����� ���� �����ش�
		  	- !false :true
		  	- !true : false
		 */	
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(!true);
		
	}
	
}
