package chapter05.EX01;

public class Using_Array06 {

	public static void main(String[] args) {
		//배열 선언 방법 1. 자료형 뒤 대괄호	<<권장사항>>
		int[] array1 = new int[3];			//배열 선언, 초기화(강제로 초기값 할당)
		
		int[] array2 ; 						//배열 선언
		array2 = new int[3];				//배열 초기화(강제로 초기값 할당)
		
		//배열 선언 방법 2. 변수 명 뒤 대괄호
		int array3[] = new int [3];			//선언과 동시에 초기화
		
		int array4[];						//선언
		array4 = new int[3];				//초기화
		
		//다양한 방법으로 배열 선언 (
		
		
			//배열은 참조자료형 : Stack : 변수명(heap의 주소), Heap : 값
				//Heap 영역의 방에는 반드시 값이 할당이 되어 있어야 한다.
				//	- JVM이 초기값을 자동으로 할당한다.
		
		boolean[] array5 = new boolean[3];	//기본값으로 false가 기본값
		System.out.println(array5[0]);
		int [] array6 = new int[3];			//기본값으로 0
		System.out.println(array6[0]);
		double [] array7 = new double[3];	//기본값으로 0.0
		System.out.println(array7[0]);	
		String[] array8 = new String[3];	//기본값으로 null
		System.out.println(array8[0]);
		
	}

}
