package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {

		String ssn = "880815-1234567";
		
//		subString(시작위치, 종료위치 x);
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
//		subString(시작위치~끝)
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
