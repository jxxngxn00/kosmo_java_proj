package chapter02.EX09;

public class TypeCasting_3 {

	public static void main(String[] args) {
		// #1. 같은 자료형 간의 연산
		int value1 = 3 + 5;
		int value2 = 8/5;						//주의 : 나눗셈을 할 경우 int 타입으로 계산하면 
												//		정확한 값이 출력되지 않을 수 있음
		double value2_1 = 8/5;
		double value2_2 = 8.0/5;
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;
		
		//byte, short를 연산을 하면 정수(int)로 처리해야됨.
		byte data1 = 3;
		byte data2 = 5;
		
		byte data3 = 7;
		byte data4 = 9;
		
		//byte value5 = data1 + data2;	//오류 발생
		int value5 = data1 + data2;		//byte, short 연산 후 int 타임으로 처리해야함
		//short value5_2 = data3 + data4; 오류발생
		int value5_2 = data3 + data4;
		
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);		//부정확한 값 출력 : 1
		System.out.println("value2_1 : "+value2_1);	//부정확한 값 출력 : 1.0
		System.out.println("value2_2 : "+value2_2);	//정확한 값 출력 : 1.6
		System.out.println("value3 : "+value3);	
		System.out.println("value4 : "+value4);	
		System.out.println("value5 : "+value5);
		System.out.println("value5_2 : "+value5_2);

		System.out.println("\n===============\n");
		
		// #2. 다른 자료형 간의 연산 (작은 자료형이 큰 자료형으로 자동으로 업캐스팅 되어 연산됨)
		
		//int value6 = 5 + 3.5; 오류발생
		int value6 = (int) (5 + 3.5);	
		System.out.println("value6 : "+value6);		//int로 다운 캐스팅
		
		double value7 = 5 + 3.5;
		System.out.println("value7 : "+value7);		//5가 double로 업캐스팅
		int value7_1 = 5 + (int)3.5;
		System.out.println("value7_1 : "+value7_1);
		
		
		double value8 = 5/2.0;
		byte data33 = 3;
		short data44 = 5;
		int value9 = data33 + data44;	//주의 : byte, short의 연산결과는 int로 처리
		double value10 = data33 + data44;
		
		System.out.println("value8 : "+value8);
		System.out.println("value9 : "+value9);
		System.out.println("value10 : "+value10);
		
	}

}
