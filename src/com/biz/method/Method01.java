package com.biz.method;

public class Method01 {

	/*
	 * int a = 0; // 명령문, statement
	 * 
	 * if(){ //명령구문(여러줄에 걸쳐 나타나는 것)
	 * ...
	 * ...
	 * }
	 * 
	 * method : Java에 없는 새로운 명령문을 생성하는 것
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0;
		intNum = 3+4;
		intNum = 10 * 100;
		
		intNum += 20 +30; // intNum = intNum + (20 + 30);
		
		numMethod(); // 하는 일이 아무것도 없는 명령문을 실행한 것.
		
		viewMessage(); // System.out.println("반갑습니다."); => 을 viewMessage()한테 대신 시킨 것.
		
		int intN = numMethod(); 
		intN = plusM();
		// intN = viewMessage();
		
	}
	public static int plusM() {
		// void keyword가 아닌 type형 method에서는
		// return문이 반드시 있어야 한다.
		// 이 method는 호출하는 곳에서 = 의 오른쪽에 사용될 수 있다.
		return 3+4;
		
	}
	
	public static void viewMessage() {
		System.out.println("반갑습니다.");
		System.out.println("오늘은 목요일");
		// return ;
		// void keyword가 포함된 method에서 return명령문을 사용하면
		// 그 아래쪽 모든 명령문을 무시하라 하는 것이다.
		// System.out.println("내일은 불금이다.");
	}
	
	
	public static int numMethod() {
		return 0;
		
	}

}
