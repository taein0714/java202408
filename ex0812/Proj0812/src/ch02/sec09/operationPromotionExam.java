package ch02.sec09;

public class operationPromotionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		byte v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10 / (double)v11;
		double result7_1 = (double)v10 / v11;
		double result7_2 = (double)((int)v10 / (int)v11);
		double result7_3 = (double)(v10 / v11);
		System.out.println("result7: " + result7);
		System.out.println("result7_1: " + result7_1);
		System.out.println("result7_2: " + result7_2);
		System.out.println("result7_3: " + result7_3);

	}

}
