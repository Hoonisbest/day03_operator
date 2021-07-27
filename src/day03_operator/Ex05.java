package day03_operator;

public class Ex05 {
	public static void main(String[] args) {
		/*
		  논리 연산자
		  -참 또는 거짓을 표현
		  - ||(or) : 하나라도 참이 존재하면 결과는 참
		  	-true || false : true
		  	-false || false :false
		  	-( (10>20) || ( 20 == 20) ) : true
		  -&&(and) : 모두가 참일때 참, 하나라도 거짓일시 거짓
		   - true && false : false
		   - true && true : true
		  -!(not) : 결과를 반전 시켜준다
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
